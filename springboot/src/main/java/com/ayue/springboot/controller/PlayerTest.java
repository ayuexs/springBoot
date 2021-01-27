package com.ayue.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayue.springboot.db.po.Player;
import com.ayue.springboot.service.PlayerService;

/**
 * 2021年1月27日
 *
 * @author ayue
 */
@RestController
@RequestMapping("/player")
public class PlayerTest {
        Logger log = LoggerFactory.getLogger(PlayerTest.class);
        @Autowired
        private PlayerService playerService;

        @PostMapping("/hello2")
        public String hello2(String s) {
                log.info("hhh2h2h22" + s);
                return "hhhh2222";
        }

        @RequestMapping("/players")
        public String players() {
                List<Player> players = playerService.getPlayer();
                log.info("player" + players.size());
                return "" + players.size();
        }

}
