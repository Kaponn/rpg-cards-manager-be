package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.advancedArmor.AdvancedArmor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvancedArmorRepository extends JpaRepository<AdvancedArmor, Long> {
}
