package com.example.rpgcardsmanagerbe.fightMovement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FightMovement {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int movement;
  private int charge;
  private int run;

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
