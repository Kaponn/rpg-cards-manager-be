package com.example.rpgcardsmanagerbe.gold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/gold")
public class GoldController {

    @Autowired
    private GoldService goldService;

    @GetMapping
    public ResponseEntity<List<Gold>> getAllGold() {
        List<Gold> goldList = goldService.getAllGold();
        return new ResponseEntity<>(goldList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gold> getGoldById(@PathVariable Long id) {
        Gold gold = goldService.getGoldById(id);
        return gold != null
                ? new ResponseEntity<>(gold, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Gold> createGold(@RequestBody Gold gold) {
        Gold createdGold = goldService.createGold(gold);
        return new ResponseEntity<>(createdGold, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Gold> updateGold(@PathVariable Long id, @RequestBody Gold newGold) {
        Gold updatedGold = goldService.updateGold(id, newGold);
        return updatedGold != null
                ? new ResponseEntity<>(updatedGold, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGold(@PathVariable Long id) {
        goldService.deleteGold(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

