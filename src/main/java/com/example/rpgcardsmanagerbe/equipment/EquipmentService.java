package com.example.rpgcardsmanagerbe.equipment;

import com.example.rpgcardsmanagerbe.repositories.EquipmentRepository;
import com.example.rpgcardsmanagerbe.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Autowired
    private HeroRepository heroRepository;

    public List<Equipment> getAllEquipment() {
        return equipmentRepository.findAll();
    }

    public Equipment getEquipmentById(Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    public Equipment createEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public Equipment updateEquipment(Long id, Equipment newEquipment) {
        Equipment existingEquipment = getEquipmentById(id);
        if (existingEquipment != null) {
            existingEquipment.setItem(newEquipment.getItem());
            existingEquipment.setWeight(newEquipment.getWeight());
            existingEquipment.setDescription(newEquipment.getDescription());

            return equipmentRepository.save(existingEquipment);
        }
        return null;
    }

    public void deleteEquipment(Long id) {
        equipmentRepository.deleteById(id);
    }

    public List<Equipment> findEquipmentByHeroId(Long heroId) {
        return equipmentRepository.findByHero_Id(heroId);
    }

    public List<Equipment> findAllByHeroId(Long heroId) {
        return equipmentRepository.findAllByHero_Id(heroId);
    }
    public void updateEquipmentByHeroId(Long heroId, List<Equipment> newEquipment) {
        List<Equipment> existingEquipment = findEquipmentByHeroId(heroId);

        for (Equipment newEquip : newEquipment) {
            Equipment existingEquip = existingEquipment.stream()
                    .filter(equip -> equip.getId().equals(newEquip.getId()))
                    .findFirst()
                    .orElse(null);

            if (existingEquip != null) {
                // Update existing equipment
                existingEquip.setItem(newEquip.getItem());
                existingEquip.setWeight(newEquip.getWeight());
                existingEquip.setDescription(newEquip.getDescription());
            } else {
                // Save new equipment
                newEquip.setHero(heroRepository.findById(heroId).orElse(null));
                equipmentRepository.save(newEquip);
            }
        }

        // Save updated equipment
        equipmentRepository.saveAll(existingEquipment);
    }
}
