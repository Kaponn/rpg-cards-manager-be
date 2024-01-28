package com.example.rpgcardsmanagerbe.gold;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class Gold {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//  @OneToOne
//  private Hero hero;
  private int gold;
  private int silver;
  private int copper;

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

  public int getGold() {
    return gold;
  }

  public void setGold(int gold) {
    this.gold = gold;
  }

  public int getSilver() {
    return silver;
  }

  public void setSilver(int silver) {
    this.silver = silver;
  }

  public int getCopper() {
    return copper;
  }

  public void setCopper(int copper) {
    this.copper = copper;
  }
}
