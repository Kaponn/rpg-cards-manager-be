package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.skills.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
    List<Skills> findByHero_Id(Long heroId);
    List<Skills> findAllByHero_Id(Long heroId);
}
