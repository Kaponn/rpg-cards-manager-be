package com.example.rpgcardsmanagerbe.expPoints;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExpPoints {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int currentPoints;
  private int allPoints;

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
