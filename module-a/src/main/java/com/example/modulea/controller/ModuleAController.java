package com.example.modulea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleAController {
    @GetMapping("/module-a")
    public String getMessageFromModuleA() {
        return "Hello from Module A!";
    }
}
