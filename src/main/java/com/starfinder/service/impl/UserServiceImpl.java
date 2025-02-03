package com.starfinder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starfinder.dto.RegisterDTO;
import com.starfinder.entity.User;
import com.starfinder.entity.Response;
import com.starfinder.mapper.UserMapper;
import com.starfinder.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Response<User> createUser(RegisterDTO registerDTO) {
        User user = new User();
        user.setPhoneNumber(registerDTO.getPhoneNumber());
        user.setPassword(registerDTO.getPassword());
        // 设置默认值
        user.setName("未命名");
        user.setRace("");
        user.setMmr(0);

        userMapper.insert(user);
        return new Response<>(
                null, // TODO 换成DTO.result.success，但先研究这里我为什么不能"user"
                200,
                "注册成功",
                "token123" // TODO: 生成token
        );
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.findById(id);
    }
}