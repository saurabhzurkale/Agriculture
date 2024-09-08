package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.SeedVariety;
import com.service.SeedVarietyService;

@RestController
@RequestMapping("/api")
public class SeedVarietyController {
    @Autowired
    private SeedVarietyService service;

    @GetMapping
    public List<SeedVariety> getAllSeedVarieties() {
        return service.getAllSeedVarieties();
    }

    @GetMapping("/{id}")
    public SeedVariety getSeedVarietyById(@PathVariable Long id) {
        return service.getSeedVarietyById(id);
    }

    @PostMapping("/seed")
    public SeedVariety addSeedVariety(@RequestBody SeedVariety seedVariety) {
        return service.addSeedVariety(seedVariety);
    }

    @PutMapping("/{id}")
    public SeedVariety updateSeedVariety(@PathVariable Long id, @RequestBody SeedVariety seedVariety) {
        return service.updateSeedVariety(seedVariety);
    }

    @DeleteMapping("/{id}")
    public void deleteSeedVariety(@PathVariable Long id) {
        service.deleteSeedVariety(id);
    }
}
