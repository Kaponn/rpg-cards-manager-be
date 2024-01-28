package com.example.rpgcardsmanagerbe.advancedArmor;

import com.example.rpgcardsmanagerbe.repositories.AdvancedArmorRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvancedArmorService {

    @Autowired
    private AdvancedArmorRepository advancedArmorRepository;

    @Autowired
    private HeroRepository heroRepository;
    public List<AdvancedArmor> getAllAdvancedArmor() {
        return advancedArmorRepository.findAll();
    }

    public AdvancedArmor getAdvancedArmorById(Long id) {
        return advancedArmorRepository.findById(id).orElse(null);
    }

    public AdvancedArmor createAdvancedArmor(AdvancedArmor advancedArmor) {
        return advancedArmorRepository.save(advancedArmor);
    }

    public AdvancedArmor updateAdvancedArmor(Long id, AdvancedArmor newAdvancedArmor) {
        AdvancedArmor existingAdvancedArmor = getAdvancedArmorById(id);
        if (existingAdvancedArmor != null) {
            existingAdvancedArmor.setType(newAdvancedArmor.getType());
            existingAdvancedArmor.setWeight(newAdvancedArmor.getWeight());
            existingAdvancedArmor.setLocation(newAdvancedArmor.getLocation());
            existingAdvancedArmor.setHealthPoints(newAdvancedArmor.getHealthPoints());

            return advancedArmorRepository.save(existingAdvancedArmor);
        }
        return null;
    }

    public void deleteAdvancedArmor(Long id) {
        advancedArmorRepository.deleteById(id);
    }

    public List<AdvancedArmor> findAdvancedArmorByHeroId(Long heroId) {
        return advancedArmorRepository.findByHero_Id(heroId);
    }

    public List<AdvancedArmor> findAllByHeroId(Long heroId) {
        return advancedArmorRepository.findAllByHero_Id(heroId);
    }

    public void updateAdvancedArmorByHeroId(Long heroId, List<AdvancedArmor> newAdvancedArmors) {
        List<AdvancedArmor> existingAdvancedArmors = findAdvancedArmorByHeroId(heroId);

        for (AdvancedArmor newAdvancedArmor : newAdvancedArmors) {
            AdvancedArmor existingAdvancedArmor = existingAdvancedArmors.stream()
                    .filter(advancedArmor -> advancedArmor.getId().equals(newAdvancedArmor.getId()))
                    .findFirst()
                    .orElse(null);

            if (existingAdvancedArmor != null) {
                existingAdvancedArmor.setType(newAdvancedArmor.getType());
                existingAdvancedArmor.setWeight(newAdvancedArmor.getWeight());
                existingAdvancedArmor.setLocation(newAdvancedArmor.getLocation());
                existingAdvancedArmor.setHealthPoints(newAdvancedArmor.getHealthPoints());
            } else {
                newAdvancedArmor.setHero(heroRepository.findById(heroId).orElse(null));
                advancedArmorRepository.save(newAdvancedArmor);
            }
        }

        advancedArmorRepository.saveAll(existingAdvancedArmors);
    }
}
