package com.nginx.reverse.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NginxController {

    @Value("${server.port}")
    private int serverPort;


    @GetMapping("hello2")
    public String hello() {
        return "Hello, I am being printed from ec2 first application with port ..." + serverPort;
    }
}
