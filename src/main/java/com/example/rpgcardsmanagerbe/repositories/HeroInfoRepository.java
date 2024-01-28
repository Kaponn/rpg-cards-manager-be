package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.heroInfo.HeroInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroInfoRepository extends JpaRepository<HeroInfo, Long> {
//    HeroInfo findByHero_Id(Long heroId);
}
