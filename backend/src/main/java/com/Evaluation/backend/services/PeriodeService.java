package com.Evaluation.backend.services;

import com.Evaluation.backend.model.Periode;
import com.Evaluation.backend.repositories.PeriodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodeService {
    @Autowired
    private PeriodeRepository periodeRepository;

    public List<Periode> getAllPeriodes() {
        return periodeRepository.findAll();
    }
}
