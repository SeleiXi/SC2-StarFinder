package com.starfinder.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starfinder.dto.RegisterDTO;
import com.starfinder.dto.Result;
import com.starfinder.entity.User;
import com.starfinder.mapper.UserMapper;
import com.starfinder.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result<User> createUser(RegisterDTO registerDTO) {
        User user = new User();
        user.setPhoneNumber(registerDTO.getPhoneNumber()); // TODO： 将数据库栏位设置为唯一，以使phoneNum唯一
        user.setPassword(registerDTO.getPassword());
        // 设置默认值
        user.setName("未命名");
        user.setRace("");
        user.setMmr(0);

        userMapper.insert(user);

        return Result.success(); // TODO: 在Data返回一个JWT Token
    }

    @Override
    public Result<User> verifyUser(RegisterDTO loginDTO) {
        String userPhoneNum = loginDTO.getPhoneNumber();
        String password = loginDTO.getPassword();
        User user = userMapper.findByPhoneNum(userPhoneNum);
        if (password == user.getPassword()) {
            return Result.success();
        }
        return Result.BadRequest("Wrong Password");
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.findById(id);
    }
}