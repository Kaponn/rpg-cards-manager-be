package com.example.rpgcardsmanagerbe.simpleArmor;

import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import com.example.rpgcardsmanagerbe.repositories.SimpleArmorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SimpleArmorService {

    @Autowired
    private SimpleArmorRepository simpleArmorRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<SimpleArmor> getAllSimpleArmors() {
        return simpleArmorRepository.findAll();
    }

    public SimpleArmor getSimpleArmorById(Long id) {
        return simpleArmorRepository.findById(id).orElse(null);
    }

    public SimpleArmor createSimpleArmor(SimpleArmor simpleArmor) {
        return simpleArmorRepository.save(simpleArmor);
    }

    public SimpleArmor updateSimpleArmor(Long id, SimpleArmor newSimpleArmor) {
        SimpleArmor existingSimpleArmor = getSimpleArmorById(id);
        if (existingSimpleArmor != null) {
            existingSimpleArmor.setName(newSimpleArmor.getName());
            existingSimpleArmor.setType(newSimpleArmor.getType());
            existingSimpleArmor.setHealthPoints(newSimpleArmor.getHealthPoints());

            return simpleArmorRepository.save(existingSimpleArmor);
        }
        return null;
    }

    public void deleteSimpleArmor(Long id) {
        simpleArmorRepository.deleteById(id);
    }

    public SimpleArmor findByHeroId(Long heroId) {
        return Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getSimpleArmor();
    }

    public void updateSimpleArmorByHeroId(Long heroId, SimpleArmor newSimpleArmor) {
        SimpleArmor simpleArmor = findByHeroId(heroId);
//        SimpleArmor simpleArmor = Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getSimpleArmor();
        simpleArmor.setName(newSimpleArmor.getName());
        simpleArmor.setType(newSimpleArmor.getType());
        simpleArmor.setHealthPoints(newSimpleArmor.getHealthPoints());
        simpleArmorRepository.save(simpleArmor);
    }
}
