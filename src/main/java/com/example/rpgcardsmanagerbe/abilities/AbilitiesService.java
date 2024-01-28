package com.example.rpgcardsmanagerbe.abilities;

import com.example.rpgcardsmanagerbe.repositories.AbilitiesRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilitiesService {

    @Autowired
    private AbilitiesRepository abilitiesRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<Abilities> getAllAbilities() {
        return abilitiesRepository.findAll();
    }

    public Abilities getAbilitiesById(Long id) {
        return abilitiesRepository.findById(id).orElse(null);
    }

    public Abilities createAbilities(Abilities abilities) {
        return abilitiesRepository.save(abilities);
    }

    public List<Abilities> findAbilitiesByHero_Id(Long heroId) {
        return abilitiesRepository.findByHero_Id(heroId);
    }

    public List<Abilities> findAllByHero_Id(Long heroId) {
        return abilitiesRepository.findAllByHero_Id(heroId);
    }
    public void updateAbilitiesByHeroId(Long heroId, List<Abilities> newAbilities) {
        List<Abilities> existingAbilities = findAbilitiesByHero_Id(heroId);

        for (Abilities newAbility : newAbilities) {
            Abilities existingAbility = existingAbilities.stream()
                    .filter(ability -> ability.getId().equals(newAbility.getId()))
                    .findFirst()
                    .orElse(null);

            if (existingAbility != null) {
                // Update existing ability
                existingAbility.setAbility(newAbility.getAbility());
                existingAbility.setDesc(newAbility.getDesc());
            } else {
                // Save new ability
                newAbility.setHero(heroRepository.findById(heroId).orElse(null));
                abilitiesRepository.save(newAbility);
            }
        }

        // Save updated abilities
        abilitiesRepository.saveAll(existingAbilities);
    }

    public Abilities updateAbilities(Long id, Abilities newAbilities) {
        Abilities existingAbilities = getAbilitiesById(id);
        if (existingAbilities != null) {
            existingAbilities.setAbility(newAbilities.getAbility());
            existingAbilities.setDesc(newAbilities.getDesc());

            return abilitiesRepository.save(existingAbilities);
        }
        return null;
    }

    public void deleteAbilities(Long id) {
        abilitiesRepository.deleteById(id);
    }
}

