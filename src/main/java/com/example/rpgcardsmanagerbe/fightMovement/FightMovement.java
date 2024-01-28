package com.example.rpgcardsmanagerbe.fightMovement;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class FightMovement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//  @OneToOne
//  private Hero hero;
  private int movement;
  private int charge;
  private int run;

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

  public int getMovement() {
    return movement;
  }

  public void setMovement(int movement) {
    this.movement = movement;
  }

  public int getCharge() {
    return charge;
  }

  public void setCharge(int charge) {
    this.charge = charge;
  }

  public int getRun() {
    return run;
  }

  public void setRun(int run) {
    this.run = run;
  }
}
