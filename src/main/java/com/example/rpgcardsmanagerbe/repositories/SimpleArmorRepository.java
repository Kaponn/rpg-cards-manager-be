package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.simpleArmor.SimpleArmor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleArmorRepository extends JpaRepository<SimpleArmor, Long> {
//    SimpleArmor findByHero_Id(Long heroId);
}
