package com.example.kafkamyexample.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "sending-topic", groupId = "sending-topics")
    public void receiveMsg(String message){
        System.out.println("This is the receiving message...." + message);
    }
}
