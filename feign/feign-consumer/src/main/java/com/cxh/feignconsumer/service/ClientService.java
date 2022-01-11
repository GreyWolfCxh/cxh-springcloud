package com.cxh.feignconsumer.service;


import com.cxh.feignconsumer.service.fallback.ClientServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "feign-client", fallback = ClientServiceHystrix.class)
public interface ClientService {

    @GetMapping("/add")
    String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
