package com.example.rpgcardsmanagerbe.skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @GetMapping
    public ResponseEntity<List<Skills>> getAllSkills() {
        List<Skills> skillsList = skillsService.getAllSkills();
        return new ResponseEntity<>(skillsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skills> getSkillsById(@PathVariable Long id) {
        Skills skills = skillsService.getSkillsById(id);
        return skills != null
                ? new ResponseEntity<>(skills, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Skills> createSkills(@RequestBody Skills skills) {
        Skills createdSkills = skillsService.createSkills(skills);
        return new ResponseEntity<>(createdSkills, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Skills> updateSkills(@PathVariable Long id, @RequestBody Skills newSkills) {
        Skills updatedSkills = skillsService.updateSkills(id, newSkills);
        return updatedSkills != null
                ? new ResponseEntity<>(updatedSkills, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSkills(@PathVariable Long id) {
        skillsService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
