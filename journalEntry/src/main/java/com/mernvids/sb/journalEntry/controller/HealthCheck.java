package com.mernvids.sb.journalEntry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/check-health")
    public String healthCheck(){
        return "Im alright!";
    }
}
