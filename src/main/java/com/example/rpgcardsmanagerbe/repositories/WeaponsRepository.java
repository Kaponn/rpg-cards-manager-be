package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.weapons.Weapons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponsRepository extends JpaRepository<Weapons, Long> {
}
