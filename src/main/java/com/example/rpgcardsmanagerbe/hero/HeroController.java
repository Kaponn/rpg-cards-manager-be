package com.example.rpgcardsmanagerbe.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/heroes")
public class HeroController {

  private final HeroService heroService;

  @Autowired
  public HeroController(HeroService heroService) {
    this.heroService = heroService;
  }

  @GetMapping
  public ResponseEntity<List<Hero>> getAllHeroes() {
    List<Hero> heroes = heroService.getAllHeroes();
    return new ResponseEntity<>(heroes, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Hero> getHeroById(@PathVariable Long id) {
    Optional<Hero> hero = heroService.getHeroById(id);
    return hero.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping
  public ResponseEntity<Hero> saveHero(@RequestBody Hero hero) {
    Hero savedHero = heroService.saveHero(hero);
    return new ResponseEntity<>(savedHero, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteHero(@PathVariable Long id) {
    heroService.deleteHero(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @PostMapping("/createEmptyHero")
  public ResponseEntity<Hero> createEmptyHero() {
    Hero hero = heroService.createEmptyHero();
    heroService.saveHero(hero);
    return new ResponseEntity<>(hero, HttpStatus.CREATED);
  }

  @PostMapping("/createHeroByUserInputs")
  public ResponseEntity<Hero> createHeroByUserInputs(@RequestBody HeroCreationRequest request) {
    System.out.println("HeroCreationRequest: " + request);
    try {
      Hero hero = heroService.createHeroByUserInputs(request.getProfessionName(), request.getStarterAttributes(), request.getRace(), request.getHealthPoints(), request.getFatePoints(), request.getAge(), request.getEyeColor(), request.getHairColor(), request.getWeight(), request.getHeight(), request.getStartSign(), request.getSiblings(), request.getBirthPlace(), request.getSpecialSigns(), request.getName());
      heroService.saveHero(hero);
      return new ResponseEntity<>(hero, HttpStatus.CREATED);
    } catch (Exception e) {
      // Log the exception
      System.err.println("Error creating hero: " + e.getMessage());
      e.printStackTrace();

      // Return a 500 Internal Server Error response
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }

  @PutMapping("/{heroId}")
  public ResponseEntity<Hero> updateHero(@PathVariable Long heroId, @RequestBody Hero updatedHero) {
    heroService.updateHero(heroId, updatedHero);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
