package com.example.rpgcardsmanagerbe.abilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/abilities")
public class AbilitiesController {

    @Autowired
    private AbilitiesService abilitiesService;

    @GetMapping
    public ResponseEntity<List<Abilities>> getAllAbilities() {
        List<Abilities> abilitiesList = abilitiesService.getAllAbilities();
        return new ResponseEntity<>(abilitiesList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Abilities> getAbilitiesById(@PathVariable Long id) {
        Abilities abilities = abilitiesService.getAbilitiesById(id);
        return abilities != null
                ? new ResponseEntity<>(abilities, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Abilities> createAbilities(@RequestBody Abilities abilities) {
        Abilities createdAbilities = abilitiesService.createAbilities(abilities);
        return new ResponseEntity<>(createdAbilities, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Abilities> updateAbilities(@PathVariable Long id, @RequestBody Abilities newAbilities) {
        Abilities updatedAbilities = abilitiesService.updateAbilities(id, newAbilities);
        return updatedAbilities != null
                ? new ResponseEntity<>(updatedAbilities, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAbilities(@PathVariable Long id) {
        abilitiesService.deleteAbilities(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
