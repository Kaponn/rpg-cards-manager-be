package com.example.rpgcardsmanagerbe.skills;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class Skills {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "hero_id")
  private Hero hero;
  private String skill;
  private boolean bought;
  private boolean plus10;
  private boolean plus20;
  private String relatedAbilities;

  public Long getId() {
    return id;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public boolean isBought() {
    return bought;
  }

  public void setBought(boolean bought) {
    this.bought = bought;
  }

  public boolean isPlus10() {
    return plus10;
  }

  public void setPlus10(boolean plus10) {
    this.plus10 = plus10;
  }

  public boolean isPlus20() {
    return plus20;
  }

  public void setPlus20(boolean plus20) {
    this.plus20 = plus20;
  }

  public String getRelatedAbilities() {
    return relatedAbilities;
  }

  public void setRelatedAbilities(String relatedAbilities) {
    this.relatedAbilities = relatedAbilities;
  }
}
