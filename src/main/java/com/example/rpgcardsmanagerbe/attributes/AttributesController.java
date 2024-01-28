package com.example.rpgcardsmanagerbe.attributes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/attributes")
public class AttributesController {

    @Autowired
    private AttributesService attributesService;

    @GetMapping
    public ResponseEntity<List<Attributes>> getAllAttributes() {
        List<Attributes> attributesList = attributesService.getAllAttributes();
        return new ResponseEntity<>(attributesList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attributes> getAttributesById(@PathVariable Long id) {
        Attributes attributes = attributesService.getAttributesById(id);
        return attributes != null
                ? new ResponseEntity<>(attributes, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Attributes> createAttributes(@RequestBody Attributes attributes) {
        Attributes createdAttributes = attributesService.createAttributes(attributes);
        return new ResponseEntity<>(createdAttributes, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Attributes> updateAttributes(@PathVariable Long id, @RequestBody Attributes newAttributes) {
        Attributes updatedAttributes = attributesService.updateAttributes(id, newAttributes);
        return updatedAttributes != null
                ? new ResponseEntity<>(updatedAttributes, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttributes(@PathVariable Long id) {
        attributesService.deleteAttributes(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

