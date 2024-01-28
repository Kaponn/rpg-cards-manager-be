package com.example.rpgcardsmanagerbe.heroInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/heroInfo")
public class HeroInfoController {

    @Autowired
    private HeroInfoService heroInfoService;

    @GetMapping
    public ResponseEntity<List<HeroInfo>> getAllHeroInfos() {
        List<HeroInfo> heroInfoList = heroInfoService.getAllHeroInfos();
        return new ResponseEntity<>(heroInfoList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HeroInfo> getHeroInfoById(@PathVariable Long id) {
        HeroInfo heroInfo = heroInfoService.getHeroInfoById(id);
        return heroInfo != null
                ? new ResponseEntity<>(heroInfo, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<HeroInfo> createHeroInfo(@RequestBody HeroInfo heroInfo) {
        HeroInfo createdHeroInfo = heroInfoService.createHeroInfo(heroInfo);
        return new ResponseEntity<>(createdHeroInfo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HeroInfo> updateHeroInfo(@PathVariable Long id, @RequestBody HeroInfo newHeroInfo) {
        HeroInfo updatedHeroInfo = heroInfoService.updateHeroInfo(id, newHeroInfo);
        return updatedHeroInfo != null
                ? new ResponseEntity<>(updatedHeroInfo, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHeroInfo(@PathVariable Long id) {
        heroInfoService.deleteHeroInfo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
