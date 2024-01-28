package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.weapons.Weapons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponsRepository extends JpaRepository<Weapons, Long> {
    List<Weapons> findByHero_Id(Long heroId);
    List<Weapons> findAllByHero_Id(Long heroId);
}
