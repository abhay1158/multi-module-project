package com.example.moduleb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ModuleBController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/module-b")
    public String getMessageFromModuleB() {
        String moduleAResponse = restTemplate.getForObject("http://localhost:8081/module-a", String.class);
        return "Message from Module B: " + moduleAResponse;
    }
}
