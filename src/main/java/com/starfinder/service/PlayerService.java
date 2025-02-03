package com.starfinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starfinder.entity.Player;
import com.starfinder.mapper.PlayerMapper;

@Service
public class PlayerService {

    @Autowired
    private PlayerMapper playerMapper;

    public void createPlayer(Player player) {
        playerMapper.insert(player);
    }

    public Player getPlayerById(Long id) {
        return playerMapper.findById(id);
    }
}