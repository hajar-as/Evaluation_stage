package com.Evaluation.backend.controllers;

import com.Evaluation.backend.model.Entreprise;
import com.Evaluation.backend.services.EntrepriseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entreprises")
public class EntrepriseController {
    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping
    public List<Entreprise> getEntreprises() {
        return entrepriseService.getAllEntreprises();
    }
}
