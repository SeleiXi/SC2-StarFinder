package com.starfinder.service;

import com.starfinder.dto.RegisterDTO;
import com.starfinder.dto.Result;
import com.starfinder.entity.User;

public interface UserService {
    Result<User> createUser(RegisterDTO registerDTO);

    User getUserById(Long id);
}