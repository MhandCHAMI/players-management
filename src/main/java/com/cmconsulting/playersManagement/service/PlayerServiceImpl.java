package com.cmconsulting.playersManagement.service;

import com.cmconsulting.playersManagement.domain.Player;
import com.cmconsulting.playersManagement.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository;


    public Player getById(Long id){
        return playerRepository.getById(id);
    }

    public Player create(Player player){
        return playerRepository.save(player);
    }

    @Override
    public boolean existe(Long id) {
        return playerRepository.existsById(id);
    }

    @Override
    public void delete(Long id){
        playerRepository.deleteById(id);
    }


}
