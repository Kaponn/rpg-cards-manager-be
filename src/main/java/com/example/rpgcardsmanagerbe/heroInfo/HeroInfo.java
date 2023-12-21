package com.example.rpgcardsmanagerbe.heroInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HeroInfo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String race;
  private String previousProfession;
  private String currentProfession;

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
