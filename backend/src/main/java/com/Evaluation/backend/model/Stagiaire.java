package com.Evaluation.backend.model;

import jakarta.persistence.Entity;

// Stagiaire hérite de Personne
@Entity
public class Stagiaire extends Personne {
    private String institution;

    public Stagiaire(String institution) {
        this.institution = institution;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}