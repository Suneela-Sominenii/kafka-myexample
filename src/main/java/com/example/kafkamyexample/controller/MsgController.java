package com.example.kafkamyexample.controller;

import com.example.kafkamyexample.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MsgController {

    @Autowired
    ProducerService producerService;

    @GetMapping("/sendingMsg")
    public void sendMessage(@RequestParam("message") String message){
        producerService.sendMessage(message);
    }

}
