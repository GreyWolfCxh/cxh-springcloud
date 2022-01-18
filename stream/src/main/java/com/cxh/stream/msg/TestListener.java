package com.cxh.stream.msg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestListener {

    @StreamListener(TestTopic.INPUT)
    public void receive(String payload) {
        log.info("Received2: " + payload);
    }

    @StreamListener(value = TestTopic.INPUT, condition = "headers['version']=='1.0'")
    public void receiveV1(String payload, @Header("version") String version) {
        log.info("Received v1 : " + payload + ", " + version);
    }

    @StreamListener(value = TestTopic.INPUT, condition = "headers['version']=='2.0'")
    public void receiveV2(String payload, @Header("version") String version) {
        log.info("Received v2 : " + payload + ", " + version);
    }

}
