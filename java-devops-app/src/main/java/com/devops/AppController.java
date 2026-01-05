package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Hello DevOps! Deployed via Jenkins + Docker + ArgoCD 🚀";
    }
}
