package com.cxh.feignconsumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("feign-client")
public interface ClientService {

    @GetMapping("/add")
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
