package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalogController {

    @GetMapping("/analog")
    public String homeGreeting() {
        return "Analog is in many ways superior to digilog.";

    }
}
