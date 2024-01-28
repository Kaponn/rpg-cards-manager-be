package com.example.rpgcardsmanagerbe.heroBio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/heroBio")
public class HeroBioController {

    @Autowired
    private HeroBioService heroBioService;

    @GetMapping
    public ResponseEntity<List<HeroBio>> getAllHeroBios() {
        List<HeroBio> heroBioList = heroBioService.getAllHeroBios();
        return new ResponseEntity<>(heroBioList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HeroBio> getHeroBioById(@PathVariable Long id) {
        HeroBio heroBio = heroBioService.getHeroBioById(id);
        return heroBio != null
                ? new ResponseEntity<>(heroBio, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<HeroBio> createHeroBio(@RequestBody HeroBio heroBio) {
        HeroBio createdHeroBio = heroBioService.createHeroBio(heroBio);
        return new ResponseEntity<>(createdHeroBio, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HeroBio> updateHeroBio(@PathVariable Long id, @RequestBody HeroBio newHeroBio) {
        HeroBio updatedHeroBio = heroBioService.updateHeroBio(id, newHeroBio);
        return updatedHeroBio != null
                ? new ResponseEntity<>(updatedHeroBio, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHeroBio(@PathVariable Long id) {
        heroBioService.deleteHeroBio(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
