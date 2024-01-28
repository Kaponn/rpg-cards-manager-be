package com.example.rpgcardsmanagerbe.expPoints;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class ExpPoints {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//  @OneToOne
//  private Hero hero;
  private int currentPoints;
  private int allPoints;

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

  public int getCurrentPoints() {
    return currentPoints;
  }

  public void setCurrentPoints(int currentPoints) {
    this.currentPoints = currentPoints;
  }

  public int getAllPoints() {
    return allPoints;
  }

  public void setAllPoints(int allPoints) {
    this.allPoints = allPoints;
  }
}
