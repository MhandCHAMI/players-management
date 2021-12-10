package com.cmconsulting.playersManagement.service;

import com.cmconsulting.playersManagement.domain.Player;
import com.cmconsulting.playersManagement.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerRepository playerRepository;


    public Player getById(Long id) throws PlayerNotFoundException{
        Player ply = Player.builder().nom("belkacemi").prenom("wehhav").build();

        playerRepository.findById(id).ifPresent(player -> {
           //execute code
        });

       Optional<String> str = Optional.empty(); // permet de retourner un optional vide
        Optional.of("mhand"); // permet de retourner un optional qui peut prendre une valeur qui ne peut etre null
        Optional.ofNullable(null); // permet de retourner un optional qui peut prendre une valeur null

        String str1 = null;
        Optional.ofNullable(str1);


        return playerRepository.findById(id).orElseThrow( () -> new PlayerNotFoundException("le joueur n'existe pas"));

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
