package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class RyansController {

    @RestController
    public class RyansController {

        @GetMapping("/ryan")
        public String hello() {
        return "Hello World";
    }
}