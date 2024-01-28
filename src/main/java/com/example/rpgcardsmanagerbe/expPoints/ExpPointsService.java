package com.example.rpgcardsmanagerbe.expPoints;

import com.example.rpgcardsmanagerbe.repositories.ExpPointsRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ExpPointsService {

    @Autowired
    private ExpPointsRepository expPointsRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<ExpPoints> getAllExpPoints() {
        return expPointsRepository.findAll();
    }

    public ExpPoints getExpPointsById(Long id) {
        return expPointsRepository.findById(id).orElse(null);
    }

    public ExpPoints createExpPoints(ExpPoints expPoints) {
        return expPointsRepository.save(expPoints);
    }

    public ExpPoints updateExpPoints(Long id, ExpPoints newExpPoints) {
        ExpPoints existingExpPoints = getExpPointsById(id);
        if (existingExpPoints != null) {
            existingExpPoints.setCurrentPoints(newExpPoints.getCurrentPoints());
            existingExpPoints.setAllPoints(newExpPoints.getAllPoints());

            return expPointsRepository.save(existingExpPoints);
        }
        return null;
    }

    public void deleteExpPoints(Long id) {
        expPointsRepository.deleteById(id);
    }

    public ExpPoints findByHeroId(Long heroId) {
        return Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getExpPoints();
    }

    public void updateExpPointsByHeroId(Long heroId, ExpPoints newExpPoints) {
        ExpPoints expPoints = findByHeroId(heroId);
//        ExpPoints expPoints = Objects.requireNonNull(heroRepository.findById(heroId).orElse(null)).getExpPoints();
        expPoints.setCurrentPoints(newExpPoints.getCurrentPoints());
        expPoints.setAllPoints(newExpPoints.getAllPoints());
        expPointsRepository.save(expPoints);
    }
}
