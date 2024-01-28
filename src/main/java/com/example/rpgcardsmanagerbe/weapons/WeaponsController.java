package com.example.rpgcardsmanagerbe.weapons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weapons")
public class WeaponsController {

    @Autowired
    private WeaponsService weaponsService;

    @GetMapping ResponseEntity<List<Weapons>> getAllWeapons() {
        List<Weapons> weaponsList = weaponsService.getAllWeapons();
        return new ResponseEntity<>(weaponsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Weapons> getWeaponsById(@PathVariable Long id) {
        Weapons weapons = weaponsService.getWeaponsById(id);
        return weapons != null
                ? new ResponseEntity<>(weapons, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Weapons> createWeapons(@RequestBody Weapons weapons) {
        Weapons createdWeapons = weaponsService.createWeapons(weapons);
        return new ResponseEntity<>(createdWeapons, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Weapons> updateWeapons(@PathVariable Long id, @RequestBody Weapons newWeapons) {
        Weapons updatedWeapons = weaponsService.updateWeapons(id, newWeapons);
        return updatedWeapons != null
                ? new ResponseEntity<>(updatedWeapons, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWeapons(@PathVariable Long id) {
        weaponsService.deleteWeapons(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
