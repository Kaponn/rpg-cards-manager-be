package com.example.rpgcardsmanagerbe.advancedArmor;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class AdvancedArmor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "hero_id")
  private Hero hero;
  private String type;
  private int weight;
  private String location;
  private int healthPoints;

  public Long getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }
}
