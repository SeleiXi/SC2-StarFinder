package com.example.demo;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

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
