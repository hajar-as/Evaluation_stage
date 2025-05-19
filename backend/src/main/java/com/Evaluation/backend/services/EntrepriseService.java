package com.Evaluation.backend.services;

import com.Evaluation.backend.model.Entreprise;
import com.Evaluation.backend.repositories.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseService {
    @Autowired
    private EntrepriseRepository entrepriseRepository;

    public List<Entreprise> getAllEntreprises() {
        return entrepriseRepository.findAll();
    }
}
