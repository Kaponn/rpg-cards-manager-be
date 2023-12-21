package com.example.rpgcardsmanagerbe.repositories;

import com.example.rpgcardsmanagerbe.attributes.Attributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributesRepository extends JpaRepository<Attributes, Long> {
}
