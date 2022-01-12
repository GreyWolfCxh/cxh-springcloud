package com.cxh.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/port")
    public String port(){
        return port;
    }
}
