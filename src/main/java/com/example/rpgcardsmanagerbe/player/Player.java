package com.example.rpgcardsmanagerbe.player;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String gameMaster;
  private String campaign;
  private int campaignYear;

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
