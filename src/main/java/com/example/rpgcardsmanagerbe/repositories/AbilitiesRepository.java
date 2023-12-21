package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.abilities.Abilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbilitiesRepository extends JpaRepository<Abilities, Long> {
}
