package com.example.rpgcardsmanagerbe.expPoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/expPoints")
public class ExpPointsController {

    @Autowired
    private ExpPointsService expPointsService;


    @GetMapping
    public ResponseEntity<List<ExpPoints>> getAllExpPoints() {
        List<ExpPoints> expPointsList = expPointsService.getAllExpPoints();
        System.out.println("expPointsList: " + expPointsList);
        return new ResponseEntity<>(expPointsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpPoints> getExpPointsById(@PathVariable Long id) {
        ExpPoints expPoints = expPointsService.getExpPointsById(id);
        return expPoints != null
                ? new ResponseEntity<>(expPoints, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ExpPoints> createExpPoints(@RequestBody ExpPoints expPoints) {
        ExpPoints createdExpPoints = expPointsService.createExpPoints(expPoints);
        return new ResponseEntity<>(createdExpPoints, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExpPoints> updateExpPoints(@PathVariable Long id, @RequestBody ExpPoints newExpPoints) {
        ExpPoints updatedExpPoints = expPointsService.updateExpPoints(id, newExpPoints);
        return updatedExpPoints != null
                ? new ResponseEntity<>(updatedExpPoints, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpPoints(@PathVariable Long id) {
        expPointsService.deleteExpPoints(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
