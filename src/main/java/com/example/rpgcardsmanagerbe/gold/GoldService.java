package com.example.rpgcardsmanagerbe.gold;

import com.example.rpgcardsmanagerbe.repositories.GoldRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class GoldService {

    @Autowired
    private GoldRepository goldRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<Gold> getAllGold() {
        return goldRepository.findAll();
    }

    public Gold getGoldById(Long id) {
        return goldRepository.findById(id).orElse(null);
    }

    public Gold createGold(Gold gold) {
        return goldRepository.save(gold);
    }

    public Gold updateGold(Long id, Gold newGold) {
        Gold existingGold = getGoldById(id);
        if (existingGold != null) {
            existingGold.setGold(newGold.getGold());
            existingGold.setSilver(newGold.getSilver());
            existingGold.setCopper(newGold.getCopper());

            return goldRepository.save(existingGold);
        }
        return null;
    }

    public void deleteGold(Long id) {
        goldRepository.deleteById(id);
    }

    public Gold findByHeroId(Long heroId) {
        return Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getGold();
    }

    public void updateGoldByHeroId(Long heroId, Gold newGold) {
        Gold gold = findByHeroId(heroId);
//        Gold gold = Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getGold();
        gold.setGold(newGold.getGold());
        gold.setSilver(newGold.getSilver());
        gold.setCopper(newGold.getCopper());
        goldRepository.save(gold);
    }
}
