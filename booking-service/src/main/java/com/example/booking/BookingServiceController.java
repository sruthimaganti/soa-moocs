package com.example.booking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingServiceController {

    @GetMapping("/health")
    public String health() {
        return "booking-service is running";
    }

    @GetMapping("/info")
    public String info() {
        return "Request reached booking-service through Eureka/API Gateway";
    }
}
