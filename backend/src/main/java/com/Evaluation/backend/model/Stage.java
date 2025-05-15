package com.Evaluation.backend.model;

import jakarta.persistence.*;

import java.util.List;

// Entité Stage
@Entity
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;
    private String description;
    private String objectif;

    @ManyToOne
    private Entreprise entreprise;

    @ManyToMany
    private List<Stagiaire> stagiaires;

    @OneToOne
    private Periode periode;

    public Stage(String description, String objectif) {
        this.description = description;
        this.objectif = objectif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }
}