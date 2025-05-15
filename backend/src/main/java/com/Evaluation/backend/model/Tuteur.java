package com.Evaluation.backend.model;

import jakarta.persistence.Entity;

// Tuteur hérite de Personne
@Entity
public class Tuteur extends Personne {
    private String entreprise;

    public Tuteur(String entreprise) {
        this.entreprise = entreprise;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }
}