package com.starfinder.service;

import com.starfinder.dto.RegisterDTO;
import com.starfinder.entity.User;

public interface UserService {
    User createUser(RegisterDTO registerDTO);

    User getUserById(Long id);
}