package com.starfinder.controller;

import com.starfinder.entity.Player;
import com.starfinder.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/api/players")
    public Player createPlayer(@RequestBody Player player) {
        playerService.createPlayer(player);
        return player;
    }

    @GetMapping("/api/players/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return playerService.getPlayerById(id);
    }

    @GetMapping("/")
    public String getAllPlayers() {
        return "hello world";
    }
}
