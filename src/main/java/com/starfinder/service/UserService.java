package com.starfinder.service;

import com.starfinder.dto.RegisterDTO;
import com.starfinder.entity.User;
import com.starfinder.entity.Response;

public interface UserService {
    Response<User> createUser(RegisterDTO registerDTO);

    User getUserById(Long id);
}