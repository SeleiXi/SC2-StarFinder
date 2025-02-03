package com.starfinder.controller;

import com.starfinder.dto.RegisterDTO;
import com.starfinder.entity.User;
import com.starfinder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User createUser(@RequestBody RegisterDTO registerDTO) {
        return userService.createUser(registerDTO);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/")
    public String hello() {
        return "hello world";
    }
}