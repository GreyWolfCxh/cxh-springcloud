package com.cxh.sentinel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentinelController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "index:" + port;
    }
}
