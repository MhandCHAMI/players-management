package com.cmconsulting.playersManagement.steps;

import com.cmconsulting.playersManagement.domain.Equipe;
import com.cmconsulting.playersManagement.domain.Player;
import com.cmconsulting.playersManagement.domain.enumeration.Post;
import io.cucumber.java.en.When;

import java.time.Instant;
import java.util.Date;

public class PlayerStepDefinitions {

    private Player player;

    @When("i create player")
    public void iCreatePlayer(){
        player = Player.builder()
                .dateNaissance(new Date())
                .equipe(Equipe.builder().fondtion(new Date()).nomComplet("barcelone").surnom("barça").build())
                .nom("mhand")
                .numero(8)
                .prenom("chami")
                .post(Post.MILIEU_DE_TERRAIN)
                .build();

    }
}
