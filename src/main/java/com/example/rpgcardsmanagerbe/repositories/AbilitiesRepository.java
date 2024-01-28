package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.abilities.Abilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbilitiesRepository extends JpaRepository<Abilities, Long> {
    List<Abilities> findByHero_Id(Long heroId);
    List<Abilities> findAllByHero_Id(Long heroId);
}
