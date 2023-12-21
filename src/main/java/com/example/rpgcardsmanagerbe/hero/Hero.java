package com.example.rpgcardsmanagerbe.hero;

import com.example.rpgcardsmanagerbe.abilities.Abilities;
import com.example.rpgcardsmanagerbe.advancedArmor.AdvancedArmor;
import com.example.rpgcardsmanagerbe.attributes.Attributes;
import com.example.rpgcardsmanagerbe.equipment.Equipment;
import com.example.rpgcardsmanagerbe.expPoints.ExpPoints;
import com.example.rpgcardsmanagerbe.fightMovement.FightMovement;
import com.example.rpgcardsmanagerbe.gold.Gold;
import com.example.rpgcardsmanagerbe.heroBio.HeroBio;
import com.example.rpgcardsmanagerbe.heroInfo.HeroInfo;
import com.example.rpgcardsmanagerbe.player.Player;
import com.example.rpgcardsmanagerbe.simpleArmor.SimpleArmor;
import com.example.rpgcardsmanagerbe.skills.Skills;
import com.example.rpgcardsmanagerbe.weapons.Weapons;
import jakarta.persistence.*;

import java.util.List;

@Entity()
public class Hero {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @OneToOne(cascade = CascadeType.ALL)
  private HeroInfo heroInfo;
  @OneToOne(cascade = CascadeType.ALL)
  private HeroBio heroBio;
  @OneToOne(cascade = CascadeType.ALL)
  private Player player;
  @OneToOne(cascade = CascadeType.ALL)
  private ExpPoints expPoints;
  @OneToOne(cascade = CascadeType.ALL)
  private FightMovement fightMovement;
  @OneToOne(cascade = CascadeType.ALL)
  private SimpleArmor simpleArmor;
  @OneToOne(cascade = CascadeType.ALL)
  private Gold gold;
  @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
  private List<Attributes> attributes;
  @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
  private List<AdvancedArmor> advancedArmor;
  @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
  private List<Weapons> weapons;
  @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
  private List<Abilities> abilities;
  @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
  private List<Skills> skills;
  @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
  private List<Equipment> equipment;

  public Long getId() {
    return id;
  }

  public HeroInfo getHeroInfo() {
    return heroInfo;
  }

  public void setHeroInfo(HeroInfo heroInfo) {
    this.heroInfo = heroInfo;
  }

  public HeroBio getHeroBio() {
    return heroBio;
  }

  public void setHeroBio(HeroBio heroBio) {
    this.heroBio = heroBio;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public ExpPoints getExpPoints() {
    return expPoints;
  }

  public void setExpPoints(ExpPoints expPoints) {
    this.expPoints = expPoints;
  }

  public FightMovement getFightMovement() {
    return fightMovement;
  }

  public void setFightMovement(FightMovement fightMovement) {
    this.fightMovement = fightMovement;
  }

  public SimpleArmor getSimpleArmor() {
    return simpleArmor;
  }

  public void setSimpleArmor(SimpleArmor simpleArmor) {
    this.simpleArmor = simpleArmor;
  }

  public Gold getGold() {
    return gold;
  }

  public void setGold(Gold gold) {
    this.gold = gold;
  }

  public List<Attributes> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attributes> attributes) {
    this.attributes = attributes;
  }

  public List<AdvancedArmor> getAdvancedArmor() {
    return advancedArmor;
  }

  public void setAdvancedArmor(List<AdvancedArmor> advancedArmor) {
    this.advancedArmor = advancedArmor;
  }

  public List<Weapons> getWeapons() {
    return weapons;
  }

  public void setWeapons(List<Weapons> weapons) {
    this.weapons = weapons;
  }

  public List<Abilities> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<Abilities> abilities) {
    this.abilities = abilities;
  }

  public List<Skills> getSkills() {
    return skills;
  }

  public void setSkills(List<Skills> skills) {
    this.skills = skills;
  }

  public List<Equipment> getEquipment() {
    return equipment;
  }

  public void setEquipment(List<Equipment> equipment) {
    this.equipment = equipment;
  }
}
