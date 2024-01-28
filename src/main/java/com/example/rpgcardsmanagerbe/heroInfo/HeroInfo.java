package com.example.rpgcardsmanagerbe.heroInfo;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class HeroInfo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//  @OneToOne
//  private Hero hero;
  private String name;
  private String race;
  private String previousProfession;
  private String currentProfession;

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

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public String getPreviousProfession() {
    return previousProfession;
  }

  public void setPreviousProfession(String previousProfession) {
    this.previousProfession = previousProfession;
  }

  public String getCurrentProfession() {
    return currentProfession;
  }

  public void setCurrentProfession(String currentProfession) {
    this.currentProfession = currentProfession;
  }
}
