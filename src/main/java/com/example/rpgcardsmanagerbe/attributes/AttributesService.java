package com.example.rpgcardsmanagerbe.attributes;

import com.example.rpgcardsmanagerbe.repositories.AttributesRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributesService {

    @Autowired
    private AttributesRepository attributesRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<Attributes> getAllAttributes() {
        return attributesRepository.findAll();
    }

    public Attributes getAttributesById(Long id) {
        return attributesRepository.findById(id).orElse(null);
    }

    public Attributes createAttributes(Attributes attributes) {
        return attributesRepository.save(attributes);
    }

    public Attributes updateAttributes(Long id, Attributes newAttributes) {
        Attributes existingAttributes = getAttributesById(id);
        if (existingAttributes != null) {
            existingAttributes.setStarterMain(newAttributes.getStarterMain());
            existingAttributes.setDevMain(newAttributes.getDevMain());
            existingAttributes.setCurrentMain(newAttributes.getCurrentMain());
//            existingAttributes.setStarterSecondary(newAttributes.getStarterSecondary());
//            existingAttributes.setDevSecondary(newAttributes.getDevSecondary());
//            existingAttributes.setCurrentSecondary(newAttributes.getCurrentSecondary());

            return attributesRepository.save(existingAttributes);
        }
        return null;
    }

    public void deleteAttributes(Long id) {
        attributesRepository.deleteById(id);
    }

    public List<Attributes> findAttributesByHeroId(Long heroId) {
        return attributesRepository.findByHero_Id(heroId);
    }

    public List<Attributes> findAllByHeroId(Long heroId) {
        return attributesRepository.findAllByHero_Id(heroId);
    }
    public void updateAttributesByHeroId(Long heroId, List<Attributes> newAttributes) {
        List<Attributes> existingAttributes = findAttributesByHeroId(heroId);

        for (Attributes newAttribute : newAttributes) {
            Attributes existingAttribute = existingAttributes.stream()
                    .filter(attribute -> attribute.getId().equals(newAttribute.getId()))
                    .findFirst()
                    .orElse(null);

            if (existingAttribute != null) {
                existingAttribute.setStarterMain(newAttribute.getStarterMain());
                existingAttribute.setDevMain(newAttribute.getDevMain());
                existingAttribute.setCurrentMain(newAttribute.getCurrentMain());
//                existingAttribute.setStarterSecondary(newAttribute.getStarterSecondary());
//                existingAttribute.setDevSecondary(newAttribute.getDevSecondary());
//                existingAttribute.setCurrentSecondary(newAttribute.getCurrentSecondary());
            } else {
                newAttribute.setHero(heroRepository.findById(heroId).orElse(null));
                attributesRepository.save(newAttribute);
            }
        }

        attributesRepository.saveAll(existingAttributes);
    }
}
