package com.example.rpgcardsmanagerbe.fightMovement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/fightMovement")
public class FightMovementController {

    @Autowired
    private FightMovementService fightMovementService;

    @GetMapping
    public ResponseEntity<List<FightMovement>> getAllFightMovements() {
        List<FightMovement> fightMovementList = fightMovementService.getAllFightMovements();
        return new ResponseEntity<>(fightMovementList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FightMovement> getFightMovementById(@PathVariable Long id) {
        FightMovement fightMovement = fightMovementService.getFightMovementById(id);
        return fightMovement != null
                ? new ResponseEntity<>(fightMovement, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<FightMovement> createFightMovement(@RequestBody FightMovement fightMovement) {
        FightMovement createdFightMovement = fightMovementService.createFightMovement(fightMovement);
        return new ResponseEntity<>(createdFightMovement, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FightMovement> updateFightMovement(@PathVariable Long id, @RequestBody FightMovement newFightMovement) {
        FightMovement updatedFightMovement = fightMovementService.updateFightMovement(id, newFightMovement);
        return updatedFightMovement != null
                ? new ResponseEntity<>(updatedFightMovement, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFightMovement(@PathVariable Long id) {
        fightMovementService.deleteFightMovement(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
