package com.example.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

    @GetMapping("/health")
    public String health() {
        return "user-service is running";
    }

    @GetMapping("/info")
    public String info() {
        return "Request reached user-service through Eureka/API Gateway";
    }
}
