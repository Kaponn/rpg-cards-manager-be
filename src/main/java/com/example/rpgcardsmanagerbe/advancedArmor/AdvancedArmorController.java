package com.example.rpgcardsmanagerbe.advancedArmor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/advancedArmor")
public class AdvancedArmorController {

    @Autowired
    private AdvancedArmorService advancedArmorService;

    @GetMapping
    public ResponseEntity<List<AdvancedArmor>> getAllAdvancedArmor() {
        List<AdvancedArmor> advancedArmorList = advancedArmorService.getAllAdvancedArmor();
        return new ResponseEntity<>(advancedArmorList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdvancedArmor> getAdvancedArmorById(@PathVariable Long id) {
        AdvancedArmor advancedArmor = advancedArmorService.getAdvancedArmorById(id);
        return advancedArmor != null
                ? new ResponseEntity<>(advancedArmor, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<AdvancedArmor> createAdvancedArmor(@RequestBody AdvancedArmor advancedArmor) {
        AdvancedArmor createdAdvancedArmor = advancedArmorService.createAdvancedArmor(advancedArmor);
        return new ResponseEntity<>(createdAdvancedArmor, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdvancedArmor> updateAdvancedArmor(@PathVariable Long id, @RequestBody AdvancedArmor newAdvancedArmor) {
        AdvancedArmor updatedAdvancedArmor = advancedArmorService.updateAdvancedArmor(id, newAdvancedArmor);
        return updatedAdvancedArmor != null
                ? new ResponseEntity<>(updatedAdvancedArmor, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdvancedArmor(@PathVariable Long id) {
        advancedArmorService.deleteAdvancedArmor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

