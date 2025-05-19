package com.Evaluation.backend.controllers;

import com.Evaluation.backend.model.Periode;
import com.Evaluation.backend.services.PeriodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/periodes")
public class PeriodeController {
    @Autowired
    private PeriodeService periodeService;

    @GetMapping
    public List<Periode> getPeriodes() {
        return periodeService.getAllPeriodes();
    }
}
