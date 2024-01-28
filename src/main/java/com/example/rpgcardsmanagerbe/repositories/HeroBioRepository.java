package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.heroBio.HeroBio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroBioRepository extends JpaRepository<HeroBio, Long> {
//    HeroBio findByHero_Id(Long heroId);
}
