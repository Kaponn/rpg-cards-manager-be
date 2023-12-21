package com.example.rpgcardsmanagerbe.hero;

import com.example.rpgcardsmanagerbe.hero.Hero;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroService {
  private final HeroRepository heroRepository;

  @Autowired
  public HeroService(HeroRepository heroRepository) {
    this.heroRepository = heroRepository;
  }

  public List<Hero> getAllHeroes() {
    return heroRepository.findAll();
  }

  public Optional<Hero> getHeroById(Long id) {
    return heroRepository.findById(id);
  }

  public Hero saveHero(Hero hero) {
    return heroRepository.save(hero);
  }

  public void deleteHero(Long id) {
    heroRepository.deleteById(id);
  }
}
