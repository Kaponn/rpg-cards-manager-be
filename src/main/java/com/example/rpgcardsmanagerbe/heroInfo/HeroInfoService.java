package com.example.rpgcardsmanagerbe.heroInfo;

import com.example.rpgcardsmanagerbe.repositories.HeroInfoRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class HeroInfoService {

    @Autowired
    private HeroInfoRepository heroInfoRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<HeroInfo> getAllHeroInfos() {
        return heroInfoRepository.findAll();
    }

    public HeroInfo getHeroInfoById(Long id) {
        return heroInfoRepository.findById(id).orElse(null);
    }

    public HeroInfo createHeroInfo(HeroInfo heroInfo) {
        return heroInfoRepository.save(heroInfo);
    }

    public HeroInfo updateHeroInfo(Long id, HeroInfo newHeroInfo) {
        HeroInfo existingHeroInfo = getHeroInfoById(id);
        if (existingHeroInfo != null) {
            existingHeroInfo.setName(newHeroInfo.getName());
            existingHeroInfo.setRace(newHeroInfo.getRace());
            existingHeroInfo.setPreviousProfession(newHeroInfo.getPreviousProfession());
            existingHeroInfo.setCurrentProfession(newHeroInfo.getCurrentProfession());

            return heroInfoRepository.save(existingHeroInfo);
        }
        return null;
    }

    public void deleteHeroInfo(Long id) {
        heroInfoRepository.deleteById(id);
    }

    public HeroInfo findByHeroId(Long heroId) {
        return Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getHeroInfo();
    }

    public void updateHeroInfoByHeroId(Long heroId, HeroInfo newHeroInfo) {
        HeroInfo heroInfo = findByHeroId(heroId);
//        HeroInfo heroInfo = Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getHeroInfo();
        heroInfo.setName(newHeroInfo.getName());
        heroInfo.setRace(newHeroInfo.getRace());
        heroInfo.setPreviousProfession(newHeroInfo.getPreviousProfession());
        heroInfo.setCurrentProfession(newHeroInfo.getCurrentProfession());
        heroInfoRepository.save(heroInfo);
    }
}
