package com.Evaluation.backend.controllers;

import com.Evaluation.backend.model.Stage;
import com.Evaluation.backend.services.StageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stages")
public class StageController {
    @Autowired
    private StageService stageService;

    @GetMapping
    public List<Stage> getStages() {
        return stageService.getAllStages();
    }

    @PostMapping
    public ResponseEntity<Stage> createStage(@RequestBody Stage stage) {
        Stage created = stageService.saveStage(stage);
        return ResponseEntity.ok(created);
    }
}
