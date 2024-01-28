package com.example.rpgcardsmanagerbe.weapons;

import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import com.example.rpgcardsmanagerbe.repositories.WeaponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponsService {

    @Autowired
    private WeaponsRepository weaponsRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<Weapons> getAllWeapons() {
        return weaponsRepository.findAll();
    }

    public Weapons getWeaponsById(Long id) {
        return weaponsRepository.findById(id).orElse(null);
    }

    public Weapons createWeapons(Weapons weapons) {
        return weaponsRepository.save(weapons);
    }

    public Weapons updateWeapons(Long id, Weapons newWeapons) {
        Weapons existingWeapons = getWeaponsById(id);
        if (existingWeapons != null) {
            existingWeapons.setName(newWeapons.getName());
            existingWeapons.setWeight(newWeapons.getWeight());
            existingWeapons.setCategory(newWeapons.getCategory());
            existingWeapons.setStrength(newWeapons.getStrength());
            existingWeapons.setRange(newWeapons.getRange());
            existingWeapons.setReload(newWeapons.getReload());
            existingWeapons.setAttributes(newWeapons.getAttributes());

            return weaponsRepository.save(existingWeapons);
        }
        return null;
    }

    public void deleteWeapons(Long id) {
        weaponsRepository.deleteById(id);
    }

    public List<Weapons> findWeaponsByHeroId(Long heroId) {
        return weaponsRepository.findByHero_Id(heroId);
    }

    public List<Weapons> findAllByHeroId(Long heroId) {
        return weaponsRepository.findAllByHero_Id(heroId);
    }

    public void updateWeaponsByHeroId(Long heroId, List<Weapons> newWeapons) {
        List<Weapons> existingWeapons = findWeaponsByHeroId(heroId);

        for (Weapons newWeapon : newWeapons) {
            Weapons existingWeapon = existingWeapons.stream()
                    .filter(weapon -> weapon.getId().equals(newWeapon.getId()))
                    .findFirst()
                    .orElse(null);

            if (existingWeapon != null) {
                existingWeapon.setName(newWeapon.getName());
                existingWeapon.setWeight(newWeapon.getWeight());
                existingWeapon.setCategory(newWeapon.getCategory());
                existingWeapon.setStrength(newWeapon.getStrength());
                existingWeapon.setRange(newWeapon.getRange());
                existingWeapon.setReload(newWeapon.getReload());
                existingWeapon.setAttributes(newWeapon.getAttributes());

                weaponsRepository.save(existingWeapon);
            } else {
                newWeapon.setHero(heroRepository.findById(heroId).orElse(null));
                weaponsRepository.save(newWeapon);
            }
        }
    }
}
