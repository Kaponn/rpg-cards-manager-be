package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.equipment.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
