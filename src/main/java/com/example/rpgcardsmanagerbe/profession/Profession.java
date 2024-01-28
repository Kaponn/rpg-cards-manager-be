package com.example.rpgcardsmanagerbe.profession;

import java.util.List;

public class Profession {
    private String name;
    private List<Integer> devPrimary;
    private List<Integer> devSecondary;
    private List<String> abilities;
    private List<String> skills;
    private List<String> equipment;

    public Profession(String name, List<Integer> devPrimary, List<Integer> devSecondary, List<String> abilities, List<String> skills, List<String> equipment) {
        this.name = name;
        this.devPrimary = devPrimary;
        this.devSecondary = devSecondary;
        this.abilities = abilities;
        this.skills = skills;
        this.equipment = equipment;
    }

    public Profession() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getDevPrimary() {
        return devPrimary;
    }

    public void setDevPrimary(List<Integer> devPrimary) {
        this.devPrimary = devPrimary;
    }

    public List<Integer> getDevSecondary() {
        return devSecondary;
    }

    public void setDevSecondary(List<Integer> devSecondary) {
        this.devSecondary = devSecondary;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }
}
