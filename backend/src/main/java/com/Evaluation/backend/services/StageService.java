package com.Evaluation.backend.services;

import com.Evaluation.backend.model.Stage;
import com.Evaluation.backend.repositories.StageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageService {
    @Autowired
    private StageRepository stageRepository;

    public List<Stage> getAllStages() {
        return stageRepository.findAll();
    }

    public Stage saveStage(Stage stage) {
        return stageRepository.save(stage);
    }
}