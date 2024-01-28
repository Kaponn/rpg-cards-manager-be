package com.example.rpgcardsmanagerbe.attributes;

import com.example.rpgcardsmanagerbe.hero.Hero;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Attributes {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "hero_id")
  @JsonIgnore
  private Hero hero;
  private int starterMain;
  private int devMain;
  private int currentMain;
//  private int starterSecondary;
//  private int devSecondary;
//  private int currentSecondary;

  public void setHero(Hero hero) {
    this.hero = hero;
  }

  public Hero getHero() {
    return hero;
  }

  public Long getId() {
    return id;
  }

  public int getStarterMain() {
    return starterMain;
  }

  public void setStarterMain(int starterMain) {
    this.starterMain = starterMain;
  }

  public int getDevMain() {
    return devMain;
  }

  public void setDevMain(int devMain) {
    this.devMain = devMain;
  }

  public int getCurrentMain() {
    return currentMain;
  }

  public void setCurrentMain(int currentMain) {
    this.currentMain = currentMain;
  }

//  public int getStarterSecondary() {
//    return starterSecondary;
//  }
//
//  public void setStarterSecondary(int starterSecondary) {
//    this.starterSecondary = starterSecondary;
//  }
//
//  public int getDevSecondary() {
//    return devSecondary;
//  }
//
//  public void setDevSecondary(int devSecondary) {
//    this.devSecondary = devSecondary;
//  }
//
//  public int getCurrentSecondary() {
//    return currentSecondary;
//  }
//
//  public void setCurrentSecondary(int currentSecondary) {
//    this.currentSecondary = currentSecondary;
//  }
}
