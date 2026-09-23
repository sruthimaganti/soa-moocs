package com.example.room;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomServiceController {

    @GetMapping("/health")
    public String health() {
        return "room-service is running";
    }

    @GetMapping("/info")
    public String info() {
        return "Request reached room-service through Eureka/API Gateway";
    }
}
