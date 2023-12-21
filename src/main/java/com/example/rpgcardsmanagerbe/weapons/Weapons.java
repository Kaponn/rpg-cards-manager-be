package com.example.rpgcardsmanagerbe.weapons;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class Weapons {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "hero_id")
  private Hero hero;
  private String name;
  private int weight;
  private String category;
  private int strength;
  private int range;
  private String reload;
  private String attributes;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getRange() {
    return range;
  }

  public void setRange(int range) {
    this.range = range;
  }

  public String getReload() {
    return reload;
  }

  public void setReload(String reload) {
    this.reload = reload;
  }

  public String getAttributes() {
    return attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }
}
