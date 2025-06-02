package com.example.moduleb.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class ModuleBApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModuleBApplication.class, args);
    }
}
