package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.equipment.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    List<Equipment> findByHero_Id(Long heroId);
    List<Equipment> findAllByHero_Id(Long heroId);
}
