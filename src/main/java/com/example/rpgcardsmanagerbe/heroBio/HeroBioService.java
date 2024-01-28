package com.example.rpgcardsmanagerbe.heroBio;

import com.example.rpgcardsmanagerbe.repositories.HeroBioRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class HeroBioService {

    @Autowired
    private HeroBioRepository heroBioRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<HeroBio> getAllHeroBios() {
        return heroBioRepository.findAll();
    }

    public HeroBio getHeroBioById(Long id) {
        return heroBioRepository.findById(id).orElse(null);
    }

    public HeroBio createHeroBio(HeroBio heroBio) {
        return heroBioRepository.save(heroBio);
    }

    public HeroBio updateHeroBio(Long id, HeroBio newHeroBio) {
        HeroBio existingHeroBio = getHeroBioById(id);
        if (existingHeroBio != null) {
            existingHeroBio.setAge(newHeroBio.getAge());
            existingHeroBio.setGender(newHeroBio.getGender());
            existingHeroBio.setEyeColor(newHeroBio.getEyeColor());
            existingHeroBio.setHairColor(newHeroBio.getHairColor());
            existingHeroBio.setWeight(newHeroBio.getWeight());
            existingHeroBio.setHeight(newHeroBio.getHeight());
            existingHeroBio.setStarSign(newHeroBio.getStarSign());
            existingHeroBio.setSiblings(newHeroBio.getSiblings());
            existingHeroBio.setBirthPlace(newHeroBio.getBirthPlace());
            existingHeroBio.setSpecialSigns(newHeroBio.getSpecialSigns());

            return heroBioRepository.save(existingHeroBio);
        }
        return null;
    }

    public void deleteHeroBio(Long id) {
        heroBioRepository.deleteById(id);
    }

    public HeroBio findByHeroId(Long heroId) {
        return Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getHeroBio();
    }

    public void updateHeroBioByHeroId(Long heroId, HeroBio newHeroBio) {
        HeroBio heroBio = findByHeroId(heroId);
//        HeroBio heroBio = Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getHeroBio();
        heroBio.setAge(newHeroBio.getAge());
        heroBio.setGender(newHeroBio.getGender());
        heroBio.setEyeColor(newHeroBio.getEyeColor());
        heroBio.setHairColor(newHeroBio.getHairColor());
        heroBio.setWeight(newHeroBio.getWeight());
        heroBio.setHeight(newHeroBio.getHeight());
        heroBio.setStarSign(newHeroBio.getStarSign());
        heroBio.setSiblings(newHeroBio.getSiblings());
        heroBio.setBirthPlace(newHeroBio.getBirthPlace());
        heroBio.setSpecialSigns(newHeroBio.getSpecialSigns());
        heroBioRepository.save(heroBio);
    }
}
