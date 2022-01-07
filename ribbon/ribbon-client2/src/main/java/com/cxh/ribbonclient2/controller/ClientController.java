package com.cxh.ribbonclient2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/add")
    public String add(Integer a, Integer b){
        Integer c = a + b;
        log.info("端口计算：" + port + ":" + c);
        return "端口计算：" + port + ":" + c;
    }

}
