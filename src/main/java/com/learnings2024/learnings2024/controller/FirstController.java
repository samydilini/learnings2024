package com.learnings2024.learnings2024.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController{
    @GetMapping("/myendpoint")
    public String home() {
        return "Hello Docker World";
    }

    @GetMapping("/")
    public String empty() {
        return "Hello Docker World";
    }
}
