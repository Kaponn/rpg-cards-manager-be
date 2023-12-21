package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.skills.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
