package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.advancedArmor.AdvancedArmor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvancedArmorRepository extends JpaRepository<AdvancedArmor, Long> {
    List<AdvancedArmor> findByHero_Id(Long heroId);
    List<AdvancedArmor> findAllByHero_Id(Long heroId);
}
