package com.example.rpgcardsmanagerbe.fightMovement;

import com.example.rpgcardsmanagerbe.repositories.FightMovementRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class FightMovementService {

    @Autowired
    private FightMovementRepository fightMovementRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<FightMovement> getAllFightMovements() {
        return fightMovementRepository.findAll();
    }

    public FightMovement getFightMovementById(Long id) {
        return fightMovementRepository.findById(id).orElse(null);
    }

    public FightMovement createFightMovement(FightMovement fightMovement) {
        return fightMovementRepository.save(fightMovement);
    }

    public FightMovement updateFightMovement(Long id, FightMovement newFightMovement) {
        FightMovement existingFightMovement = getFightMovementById(id);
        if (existingFightMovement != null) {
            existingFightMovement.setMovement(newFightMovement.getMovement());
            existingFightMovement.setCharge(newFightMovement.getCharge());
            existingFightMovement.setRun(newFightMovement.getRun());

            return fightMovementRepository.save(existingFightMovement);
        }
        return null;
    }

    public void deleteFightMovement(Long id) {
        fightMovementRepository.deleteById(id);
    }

    public FightMovement findByHeroId(Long heroId) {
        return Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getFightMovement();
    }

    public void updateFightMovementByHeroId(Long heroId, FightMovement newFightMovement) {
        FightMovement fightMovement = findByHeroId(heroId);
//        FightMovement fightMovement = Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getFightMovement();
        fightMovement.setMovement(newFightMovement.getMovement());
        fightMovement.setCharge(newFightMovement.getCharge());
        fightMovement.setRun(newFightMovement.getRun());
        fightMovementRepository.save(fightMovement);
    }
}
