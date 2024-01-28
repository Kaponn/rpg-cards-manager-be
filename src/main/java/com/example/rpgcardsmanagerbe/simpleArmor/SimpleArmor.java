package com.example.rpgcardsmanagerbe.simpleArmor;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class SimpleArmor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//  @OneToOne
//  private Hero hero;
  private String name;
  private String type;
  private int healthPoints;

//  public Hero getHero() {
//    return hero;
//  }
//
//  public void setHero(Hero hero) {
//    this.hero = hero;
//  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }
}
