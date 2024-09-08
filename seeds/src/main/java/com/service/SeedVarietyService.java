package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.SeedVariety;
import com.repository.SeedVarietyRepository;

@Service
public class SeedVarietyService {
    @Autowired
    private SeedVarietyRepository repository;

    public List<SeedVariety> getAllSeedVarieties() {
        return repository.findAll();
    }

    public SeedVariety getSeedVarietyById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public SeedVariety addSeedVariety(SeedVariety seedVariety) {
        return repository.save(seedVariety);
    }

    public SeedVariety updateSeedVariety(SeedVariety seedVariety) {
        return repository.save(seedVariety);
    }

    public void deleteSeedVariety(Long id) {
        repository.deleteById(id);
    }
}