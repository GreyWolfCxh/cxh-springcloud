package com.cxh.gatewayclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){
        return "gateway-client端口：" + port;
    }
}
