package com.Evaluation.backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

// Entité Periode
@Entity
public class Periode {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
}