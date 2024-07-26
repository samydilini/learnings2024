package com.learnings2024.learnings2024.controller;

import com.learnings2024.learnings2024.model.UserDTO;
import com.learnings2024.learnings2024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FirstController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> home() {
        return userService.getUsers();
    }

    @GetMapping("/")
    public String empty() {
        return "Hello Docker World";
    }
}
