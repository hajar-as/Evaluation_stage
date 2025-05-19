package com.Evaluation.backend.services;

import com.Evaluation.backend.model.Stagiaire;
import com.Evaluation.backend.repositories.StagiaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StagiaireService {
    @Autowired
    private StagiaireRepository stagiaireRepository;

    public List<Stagiaire> getAllStagiaires() {
        return stagiaireRepository.findAll();
    }
}
