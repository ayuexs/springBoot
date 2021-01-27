package com.ayue.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayue.springboot.db.dao.PlayerMapper;
import com.ayue.springboot.db.po.Player;

/**
 * 2021年1月27日
 *
 * @author ayue
 */
@Service
public class PlayerService {
        @Autowired
        private PlayerMapper playerMapper;

        public List<Player> getPlayer() {
                return playerMapper.selectByExample(null);
        }
}
