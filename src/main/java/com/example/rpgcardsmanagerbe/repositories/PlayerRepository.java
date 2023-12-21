package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
