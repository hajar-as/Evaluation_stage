package com.Evaluation.backend.controllers;

import com.Evaluation.backend.model.Stagiaire;
import com.Evaluation.backend.services.StagiaireService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stagiaires")
public class StagiaireController {
    @Autowired
    private StagiaireService stagiaireService;

    @GetMapping
    public List<Stagiaire> getStagiaires() {
        return stagiaireService.getAllStagiaires();
    }
}
