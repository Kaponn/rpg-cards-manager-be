package com.example.rpgcardsmanagerbe.skills;

import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import com.example.rpgcardsmanagerbe.repositories.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {

    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }

    public Skills getSkillsById(Long id) {
        return skillsRepository.findById(id).orElse(null);
    }

    public Skills createSkills(Skills skills) {
        return skillsRepository.save(skills);
    }

    public Skills updateSkills(Long id, Skills newSkills) {
        Skills existingSkills = getSkillsById(id);
        if (existingSkills != null) {
            existingSkills.setSkill(newSkills.getSkill());
            existingSkills.setBought(newSkills.isBought());
            existingSkills.setPlus10(newSkills.isPlus10());
            existingSkills.setPlus20(newSkills.isPlus20());
            existingSkills.setRelatedAbilities(newSkills.getRelatedAbilities());


            return skillsRepository.save(existingSkills);
        }
        return null;
    }

    public void deleteSkills(Long id) {
        skillsRepository.deleteById(id);
    }

    public List<Skills> findSkillsByHeroId(Long heroId) {
        return skillsRepository.findByHero_Id(heroId);
    }

    public List<Skills> findAllByHeroId(Long heroId) {
        return skillsRepository.findAllByHero_Id(heroId);
    }
    public void updateSkillsByHeroId(Long heroId, List<Skills> newSkills) {
        List<Skills> existingSkills = findSkillsByHeroId(heroId);

        for (Skills newSkill : newSkills) {
            Skills existingSkill = existingSkills.stream()
                    .filter(skill -> skill.getId().equals(newSkill.getId()))
                    .findFirst()
                    .orElse(null);

            if (existingSkill != null) {
                existingSkill.setSkill(newSkill.getSkill());
                existingSkill.setBought(newSkill.isBought());
                existingSkill.setPlus10(newSkill.isPlus10());
                existingSkill.setPlus20(newSkill.isPlus20());
                existingSkill.setRelatedAbilities(newSkill.getRelatedAbilities());

                skillsRepository.save(existingSkill);
            } else {
                newSkill.setHero(heroRepository.findById(heroId).orElse(null));
                skillsRepository.save(newSkill);
            }
        }
    }
}
