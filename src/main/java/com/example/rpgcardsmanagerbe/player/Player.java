package com.example.rpgcardsmanagerbe.player;

import com.example.rpgcardsmanagerbe.hero.Hero;
import jakarta.persistence.*;

@Entity
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//  @OneToOne
//  private Hero hero;
  private String name;
  private String gameMaster;
  private String campaign;
  private int campaignYear;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGameMaster() {
    return gameMaster;
  }

  public void setGameMaster(String gameMaster) {
    this.gameMaster = gameMaster;
  }

  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }

  public int getCampaignYear() {
    return campaignYear;
  }

  public void setCampaignYear(int campaignYear) {
    this.campaignYear = campaignYear;
  }
}
