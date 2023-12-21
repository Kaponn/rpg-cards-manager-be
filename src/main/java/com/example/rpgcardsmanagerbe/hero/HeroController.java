package com.example.rpgcardsmanagerbe.hero;

import com.example.rpgcardsmanagerbe.hero.Hero;
import com.example.rpgcardsmanagerbe.hero.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
}
