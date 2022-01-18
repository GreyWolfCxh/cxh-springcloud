package com.cxh.stream.controller;

import com.cxh.stream.msg.TestTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestTopic testTopic;

    @GetMapping("/sendMessage")
    public String messageWithMQ(@RequestParam String message) {
        testTopic.output().send(MessageBuilder.withPayload(message).build());
        return "ok";
    }

    @GetMapping("/sendMessage2")
    public String sendMessage2(@RequestParam String message) {
        testTopic.output().send(MessageBuilder.withPayload(message).setHeader("version", "1.0").build());
        testTopic.output().send(MessageBuilder.withPayload(message).setHeader("version", "2.0").build());
        return "ok";
    }

}
