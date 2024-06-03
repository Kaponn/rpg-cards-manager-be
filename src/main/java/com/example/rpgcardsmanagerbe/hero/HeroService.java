package com.example.rpgcardsmanagerbe.hero;

import com.example.rpgcardsmanagerbe.abilities.Abilities;
import com.example.rpgcardsmanagerbe.abilities.AbilitiesService;
import com.example.rpgcardsmanagerbe.advancedArmor.AdvancedArmorService;
import com.example.rpgcardsmanagerbe.attributes.Attributes;
import com.example.rpgcardsmanagerbe.attributes.AttributesService;
import com.example.rpgcardsmanagerbe.equipment.Equipment;
import com.example.rpgcardsmanagerbe.equipment.EquipmentService;
import com.example.rpgcardsmanagerbe.expPoints.ExpPoints;
import com.example.rpgcardsmanagerbe.expPoints.ExpPointsService;
import com.example.rpgcardsmanagerbe.fightMovement.FightMovement;
import com.example.rpgcardsmanagerbe.fightMovement.FightMovementService;
import com.example.rpgcardsmanagerbe.gold.Gold;
import com.example.rpgcardsmanagerbe.gold.GoldService;
import com.example.rpgcardsmanagerbe.heroBio.HeroBio;
import com.example.rpgcardsmanagerbe.heroBio.HeroBioService;
import com.example.rpgcardsmanagerbe.heroInfo.HeroInfo;
import com.example.rpgcardsmanagerbe.heroInfo.HeroInfoService;
import com.example.rpgcardsmanagerbe.player.Player;
import com.example.rpgcardsmanagerbe.player.PlayerService;
import com.example.rpgcardsmanagerbe.profession.Profession;
import com.example.rpgcardsmanagerbe.profession.ProfessionService;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import com.example.rpgcardsmanagerbe.simpleArmor.SimpleArmor;
import com.example.rpgcardsmanagerbe.simpleArmor.SimpleArmorService;
import com.example.rpgcardsmanagerbe.skills.Skills;
import com.example.rpgcardsmanagerbe.skills.SkillsService;
import com.example.rpgcardsmanagerbe.weapons.WeaponsService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HeroService {
  private final HeroRepository heroRepository;
  private final AbilitiesService abilitiesService;
  private final AdvancedArmorService advancedArmorService;
  private final AttributesService attributesService;
  private final EquipmentService equipmentService;
  private final ExpPointsService expPointsService;
  private final FightMovementService fightMovementService;
  private final GoldService goldService;
  private final HeroBioService heroBioService;
  private final HeroInfoService heroInfoService;
  private final PlayerService playerService;
  private final SimpleArmorService simpleArmorService;
  private final SkillsService skillsService;
  private final WeaponsService weaponsService;
  private final ProfessionService professionService;

  @Autowired
  public HeroService(HeroRepository heroRepository, AbilitiesService abilitiesService, AdvancedArmorService advancedArmorService, AttributesService attributesService, EquipmentService equipmentService, ExpPointsService expPointsService, FightMovementService fightMovementService, GoldService goldService, HeroBioService heroBioService, HeroInfoService heroInfoService, PlayerService playerService, SimpleArmorService simpleArmorService, SkillsService skillsService, WeaponsService weaponsService, ProfessionService professionService) {
    this.heroRepository = heroRepository;
    this.abilitiesService = abilitiesService;
    this.advancedArmorService = advancedArmorService;
    this.attributesService = attributesService;
    this.equipmentService = equipmentService;
    this.expPointsService = expPointsService;
    this.fightMovementService = fightMovementService;
    this.goldService = goldService;
    this.heroBioService = heroBioService;
    this.heroInfoService = heroInfoService;
    this.playerService = playerService;
    this.simpleArmorService = simpleArmorService;
    this.skillsService = skillsService;
    this.weaponsService = weaponsService;
    this.professionService = professionService;
  }

  @Transactional
  public List<Hero> getAllHeroes() {
    List<Hero> heroes = heroRepository.findAll();
    heroes.forEach(hero -> {
      hero.setHeroInfo(heroInfoService.findByHeroId(hero.getId()));
      hero.setHeroBio(heroBioService.findByHeroId(hero.getId()));
      hero.setPlayer(playerService.findByHeroId(hero.getId()));
      hero.setExpPoints(expPointsService.findByHeroId(hero.getId()));
      hero.setFightMovement(fightMovementService.findByHeroId(hero.getId()));
      hero.setSimpleArmor(simpleArmorService.findByHeroId(hero.getId()));
      hero.setGold(goldService.findByHeroId(hero.getId()));
      hero.setAttributes(attributesService.findAllByHeroId(hero.getId()));
      hero.setAdvancedArmor(advancedArmorService.findAllByHeroId(hero.getId()));
      hero.setWeapons(weaponsService.findAllByHeroId(hero.getId()));
      hero.setAbilities(abilitiesService.findAllByHero_Id(hero.getId()));
      hero.setSkills(skillsService.findAllByHeroId(hero.getId()));
      hero.setEquipment(equipmentService.findAllByHeroId(hero.getId()));
    });
    return heroes;
  }

  @Transactional
  public Optional<Hero> getHeroById(Long id) {
    Optional<Hero> hero = heroRepository.findById(id);
    hero.ifPresent(value -> {
      value.setHeroInfo(heroInfoService.findByHeroId(value.getId()));
      value.setHeroBio(heroBioService.findByHeroId(value.getId()));
      value.setPlayer(playerService.findByHeroId(value.getId()));
      value.setExpPoints(expPointsService.findByHeroId(value.getId()));
      value.setFightMovement(fightMovementService.findByHeroId(value.getId()));
      value.setSimpleArmor(simpleArmorService.findByHeroId(value.getId()));
      value.setGold(goldService.findByHeroId(value.getId()));
      value.setAttributes(attributesService.findAllByHeroId(value.getId()));
      value.setAdvancedArmor(advancedArmorService.findAllByHeroId(value.getId()));
      value.setWeapons(weaponsService.findAllByHeroId(value.getId()));
      value.setAbilities(abilitiesService.findAllByHero_Id(value.getId()));
      value.setSkills(skillsService.findAllByHeroId(value.getId()));
      value.setEquipment(equipmentService.findAllByHeroId(value.getId()));
    });
    return hero;
  }

  @Transactional
  public Hero saveHero(Hero hero) {
    return heroRepository.save(hero);
  }

  public void deleteHero(Long id) {
    heroRepository.deleteById(id);
  }

  @Transactional
  public void updateHero(Long heroId, Hero updatedHero) {
    Hero existingHero = heroRepository.findById(heroId)
            .orElseThrow(() -> new EntityNotFoundException("Hero not found"));

    if (updatedHero.getAbilities() != null) {
      existingHero.setAbilities(updatedHero.getAbilities());
    }
    if (updatedHero.getAdvancedArmor() != null) {
      existingHero.setAdvancedArmor(updatedHero.getAdvancedArmor());
    }
    if (updatedHero.getAttributes() != null) {
      existingHero.setAttributes(updatedHero.getAttributes());
    }
    if (updatedHero.getEquipment() != null) {
      existingHero.setEquipment(updatedHero.getEquipment());
    }
    if (updatedHero.getExpPoints() != null) {
      existingHero.setExpPoints(updatedHero.getExpPoints());
    }
    if (updatedHero.getFightMovement() != null) {
      existingHero.setFightMovement(updatedHero.getFightMovement());
    }
    if (updatedHero.getGold() != null) {
      existingHero.setGold(updatedHero.getGold());
    }
    if (updatedHero.getHeroBio() != null) {
      existingHero.setHeroBio(updatedHero.getHeroBio());
    }
    if (updatedHero.getHeroInfo() != null) {
      existingHero.setHeroInfo(updatedHero.getHeroInfo());
    }
    if (updatedHero.getPlayer() != null) {
      existingHero.setPlayer(updatedHero.getPlayer());
    }
    if (updatedHero.getSimpleArmor() != null) {
      existingHero.setSimpleArmor(updatedHero.getSimpleArmor());
    }
    if (updatedHero.getSkills() != null) {
      existingHero.setSkills(updatedHero.getSkills());
    }
    if (updatedHero.getWeapons() != null) {
      existingHero.setWeapons(updatedHero.getWeapons());
    }

    heroRepository.save(existingHero);
 }


  @Transactional
  public Hero createEmptyHero() {
    return new Hero();
  }

  // TODO break too many inputs into data class
  @Transactional
  public Hero createHeroByUserInputs(String professionName, List<Integer> starterAttributes, String race, int healthPoints, int fatePoints, int age, String eyeColor, String hairColor, int weight, int height, String startSign, int siblings, String birthPlace, String specialSigns, String name) {
    Profession profession = professionService.getProfessionByName(professionName);
    Hero hero = new Hero();

    List<Attributes> attributes = new ArrayList<>();

    for (int i = 0; i < starterAttributes.size(); i++) {
      Attributes attribute = new Attributes();
      attribute.setStarterMain(starterAttributes.get(i));
      attribute.setDevMain(profession.getDevPrimary().get(i));
      attribute.setHero(hero);
      attributes.add(attribute);
    }

    for (int i = 0; i < starterAttributes.size(); i++) {
      Attributes attribute = new Attributes();
      switch (i) {
        case 0 -> attribute.setStarterMain(1);
        case 1 -> attribute.setStarterMain(healthPoints);
        case 2, 3 ->
                attribute.setStarterMain(Integer.parseInt(String.valueOf(starterAttributes.get(i)).substring(0, 1)));
        case 4 -> {
          switch (race) {
            case "human", "halfling" -> attribute.setStarterMain(4);
            case "elf" -> attribute.setStarterMain(5);
            case "dwarf" -> attribute.setStarterMain(3);
          }
        }
        case 7 -> attribute.setStarterMain(fatePoints);
        default -> attribute.setStarterMain(0);
      }
      attribute.setDevMain(profession.getDevSecondary().get(i));
      attribute.setHero(hero);
      attributes.add(attribute);
    }

    hero.setAttributes(attributes);

    HeroInfo heroInfo = new HeroInfo();
    heroInfo.setCurrentProfession(professionName);
    heroInfo.setName(name);
    heroInfo.setRace(race);
    hero.setHeroInfo(heroInfo);

    List<Abilities> abilities = new ArrayList<>();

    for (String ability : profession.getAbilities()) {
      Abilities newAbility = new Abilities();
      newAbility.setAbility(ability);
      newAbility.setDesc("");
      newAbility.setHero(hero);
      abilities.add(newAbility);
    }

    hero.setAbilities(abilities);

    List<Skills> skills = new ArrayList<>();

    for (String skill : profession.getSkills()) {
      Skills newSkill = new Skills();
      newSkill.setSkill(skill);
      newSkill.setBought(true);
      newSkill.setPlus10(false);
      newSkill.setPlus20(false);
      newSkill.setRelatedAbilities("");
      newSkill.setHero(hero);
      skills.add(newSkill);
    }

    hero.setSkills(skills);

    List<Equipment> equipment = new ArrayList<>();

    for (String item : profession.getEquipment()) {
      Equipment newEquipment = new Equipment();
      newEquipment.setItem(item);
      newEquipment.setWeight(0);
      newEquipment.setDescription("");
      newEquipment.setHero(hero);
      equipment.add(newEquipment);
    }

    hero.setEquipment(equipment);

    HeroBio heroBio = new HeroBio();

    heroBio.setAge(age);
    heroBio.setEyeColor(eyeColor);
    heroBio.setHairColor(hairColor);
    heroBio.setWeight(weight);
    heroBio.setHeight(height);
    heroBio.setStarSign(startSign);
    heroBio.setSiblings(siblings);
    heroBio.setBirthPlace(birthPlace);
    heroBio.setSpecialSigns(specialSigns);

    hero.setHeroBio(heroBio);

    return hero;
  }


}
