package com.cxh.feignconsumer.service.fallback;


import com.cxh.feignconsumer.service.ClientService;
import org.springframework.stereotype.Component;

@Component
public class ClientServiceHystrix implements ClientService {
    @Override
    public String add(Integer a, Integer b) {
        return "调用失败";
    }
}
