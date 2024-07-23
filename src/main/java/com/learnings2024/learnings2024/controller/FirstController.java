package com.learnings2024.learnings2024.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController{
    @GetMapping("/myenpoint")
    public String home() {
        return "Hello Docker World";
    }
}