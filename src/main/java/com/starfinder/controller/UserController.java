package com.starfinder.controller;

import com.starfinder.dto.RegisterDTO;
import com.starfinder.dto.Result;
import com.starfinder.entity.User;
import com.starfinder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result<User> createUser(@RequestBody RegisterDTO registerDTO) {
        return userService.createUser(registerDTO);
    }

    @PostMapping("/login")
    public Result<User> login(@RequestBody RegisterDTO loginDTO) {
        return userService.verifyUser(loginDTO); // TODO 本系统貌似不需要id，看看黑马有没有id栏位
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}