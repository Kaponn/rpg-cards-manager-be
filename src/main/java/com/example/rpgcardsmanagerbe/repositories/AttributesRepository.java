package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.attributes.Attributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributesRepository extends JpaRepository<Attributes, Long> {
    List<Attributes> findByHero_Id(Long heroId);
    List<Attributes> findAllByHero_Id(Long heroId);
}
