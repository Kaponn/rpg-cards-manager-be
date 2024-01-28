package com.example.rpgcardsmanagerbe.hero;

import java.util.List;

public class HeroCreationRequest {
    private String professionName;
    private List<Integer> starterAttributes;
    private String race;
    private int healthPoints;
    private int fatePoints;
    private int age;
    private String eyeColor;
    private String hairColor;
    private int weight;
    private int height;
    private String startSign;
    private int siblings;
    private String birthPlace;
    private String specialSigns;
    private String name;

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public List<Integer> getStarterAttributes() {
        return starterAttributes;
    }

    public void setStarterAttributes(List<Integer> starterAttributes) {
        this.starterAttributes = starterAttributes;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getFatePoints() {
        return fatePoints;
    }

    public void setFatePoints(int fatePoints) {
        this.fatePoints = fatePoints;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getStartSign() {
        return startSign;
    }

    public void setStartSign(String startSign) {
        this.startSign = startSign;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}