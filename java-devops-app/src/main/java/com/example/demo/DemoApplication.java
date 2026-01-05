package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello from DevOps CI/CD Pipeline 🚀";
    }
}
