package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.fightMovement.FightMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FightMovementRepository extends JpaRepository<FightMovement, Long> {
//    FightMovement findByHero_Id(Long heroId);
}
