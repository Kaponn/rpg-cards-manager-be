package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.expPoints.ExpPoints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpPointsRepository extends JpaRepository<ExpPoints, Long> {
}
