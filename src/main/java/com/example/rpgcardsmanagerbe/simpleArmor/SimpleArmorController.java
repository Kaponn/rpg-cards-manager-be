package com.example.rpgcardsmanagerbe.simpleArmor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/simpleArmor")
public class SimpleArmorController {

    @Autowired
    private SimpleArmorService simpleArmorService;

    @GetMapping
    public ResponseEntity<List<SimpleArmor>> getAllSimpleArmors() {
        List<SimpleArmor> simpleArmorList = simpleArmorService.getAllSimpleArmors();
        return new ResponseEntity<>(simpleArmorList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SimpleArmor> getSimpleArmorById(@PathVariable Long id) {
        SimpleArmor simpleArmor = simpleArmorService.getSimpleArmorById(id);
        return simpleArmor != null
                ? new ResponseEntity<>(simpleArmor, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<SimpleArmor> createSimpleArmor(@RequestBody SimpleArmor simpleArmor) {
        SimpleArmor createdSimpleArmor = simpleArmorService.createSimpleArmor(simpleArmor);
        return new ResponseEntity<>(createdSimpleArmor, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SimpleArmor> updateSimpleArmor(@PathVariable Long id, @RequestBody SimpleArmor newSimpleArmor) {
        SimpleArmor updatedSimpleArmor = simpleArmorService.updateSimpleArmor(id, newSimpleArmor);
        return updatedSimpleArmor != null
                ? new ResponseEntity<>(updatedSimpleArmor, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSimpleArmor(@PathVariable Long id) {
        simpleArmorService.deleteSimpleArmor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
