package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.gold.Gold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldRepository extends JpaRepository<Gold, Long> {
//    Gold findByHero_Id(Long heroId);
}
