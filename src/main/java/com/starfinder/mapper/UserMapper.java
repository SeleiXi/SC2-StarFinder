package com.starfinder.mapper;

import com.starfinder.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user (name, race, mmr, phone_number, password, qq) VALUES (#{name}, #{race}, #{mmr}, #{phoneNumber}, #{password}, #{qq})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(Long id);

    @Select("SELECT * FROM user WHERE phone = #{phoneNum}")
    User findByPhoneNum(String phoneNum);

}