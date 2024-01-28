package com.example.rpgcardsmanagerbe.heroBio;

import jakarta.persistence.*;

@Entity
public class HeroBio {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
//  @OneToOne
//  private Hero hero;
  private int age;
  private String gender;
  private String eyeColor;
  private String hairColor;
  private int weight;
  private int height;
  private String starSign;
  private int siblings;
  private String birthPlace;
  private String specialSigns;

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public String getHairColor() {
    return hairColor;
  }

  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getStarSign() {
    return starSign;
  }

  public void setStarSign(String starSign) {
    this.starSign = starSign;
  }

  public int getSiblings() {
    return siblings;
  }

  public void setSiblings(int siblings) {
    this.siblings = siblings;
  }

  public String getBirthPlace() {
    return birthPlace;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  public String getSpecialSigns() {
    return specialSigns;
  }

  public void setSpecialSigns(String specialSigns) {
    this.specialSigns = specialSigns;
  }
}
