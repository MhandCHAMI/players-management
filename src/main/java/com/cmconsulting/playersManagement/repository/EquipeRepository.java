package com.cmconsulting.playersManagement.repository;

import com.cmconsulting.playersManagement.domain.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

    @Query("SELECT  e from Equipe e wh")
    List<Equipe> test();
}
