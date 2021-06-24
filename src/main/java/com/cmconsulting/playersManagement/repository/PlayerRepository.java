package com.cmconsulting.playersManagement.repository;

import com.cmconsulting.playersManagement.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
