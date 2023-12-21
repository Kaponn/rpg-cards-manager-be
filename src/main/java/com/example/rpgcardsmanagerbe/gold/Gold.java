package com.example.rpgcardsmanagerbe.gold;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gold {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int gold;
  private int silver;
  private int copper;

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
