package com.example.rpgcardsmanagerbe.equipment;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class Equipment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "hero_id")
  private Hero hero;
  private String item;
  private int weight;

  public Hero getHero() {
    return hero;
  }

  public void setHero(Hero hero) {
    this.hero = hero;
  }

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  private String description;
}
