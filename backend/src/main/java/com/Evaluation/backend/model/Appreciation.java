package com.Evaluation.backend.model;

import jakarta.persistence.*;
// Entité Appreciation
@Entity
public class Appreciation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;

    @ManyToOne
    private Competence competence;

    @ManyToOne
    private Evaluation evaluation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}