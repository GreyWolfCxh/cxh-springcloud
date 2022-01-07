package com.cxh.ribbonconsumer.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/add")
    public String add() {
        String result = restTemplate.getForEntity("http://ribbon-client/add?a=10&b=20", String.class).getBody();
        log.info("返回结果：" + result);
        return result;
    }

}
