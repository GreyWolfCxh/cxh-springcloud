package com.cxh.feignconsumer.controller;


import com.cxh.feignconsumer.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@Slf4j
@RestController
public class ConsumerController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/add")
    public String add() {
        return clientService.add(10, 20);
    }



}
