package com.example.messagingrabbitmq;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        CountSpecificWord.count(message, "hendrerit");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
