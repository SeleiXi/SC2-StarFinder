package com.example.demo.service;

import com.example.demo.entity.Player;
import com.example.demo.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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