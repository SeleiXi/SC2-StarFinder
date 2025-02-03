package com.starfinder.mapper;

import com.starfinder.entity.Player;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PlayerMapper {

    @Insert("INSERT INTO player (name, race, mmr) VALUES (#{name}, #{race}, #{mmr})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Player player);

    @Select("SELECT * FROM player WHERE id = #{id}")
    Player findById(Long id);
}