package com.example.rpgcardsmanagerbe.abilities;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class Abilities {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "hero_id")
  private Hero hero;
  private String ability;
  private String description;

  public Long getId() {
    return id;
  }

  public String getAbility() {
    return ability;
  }

  public void setAbility(String ability) {
    this.ability = ability;
  }

  public String getDesc() {
    return description;
  }

  public void setDesc(String description) {
    this.description = description;
  }
}
