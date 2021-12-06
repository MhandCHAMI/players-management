package com.cmconsulting.playersManagement.web;

import com.cmconsulting.playersManagement.domain.Player;
import com.cmconsulting.playersManagement.service.PlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("api/playersss")
@Slf4j
public class PlayerController {

    @Autowired
    private PlayerService playerService;



    @GetMapping("/{id}")
    public ResponseEntity<Player> getById(@PathVariable(name = "id", required = true) long id) {
        log.debug("REST request to get Campagne : {}", id);
        Player player = playerService.getById(id);
        return ResponseEntity.ok(player);
    }


    @PostMapping()
    public ResponseEntity create(@RequestBody Player player ) throws URISyntaxException {
        log.debug("REST request to save Player : {}", "Player");
        Player playerResult= playerService.create(player);
        return ResponseEntity.created(new URI("/api/players"+ player.getId())).body(player);
    }

    @PutMapping("/{idPlayer}")
    public ResponseEntity update(@PathVariable(name = "idPlayer", required = true) Long idPlayer ,
                                 @RequestBody Player player ){
        log.debug("REST request to update player : {}", player);
        if (! playerService.existe(idPlayer)){
            //TODO créer la ClasseException
            //   throw new ClasseException("Invalid id", ENTITY_NAME, "idnull");
            //    ResponseEntity.notFound().build();
        }

        Player playerResult = playerService.create(player);
        return ResponseEntity.ok().body(playerResult);

    }


    @DeleteMapping
    public ResponseEntity delete(@PathVariable(name = "id", required = true) Long id){
        log.debug("Rest request to delete player : {}", id);
        playerService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
