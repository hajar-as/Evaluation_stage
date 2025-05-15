package com.Evaluation.backend.model;

import jakarta.persistence.*;

// Entité Entreprise
@Entity
public class Entreprise {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;
    private String nom;
    private String adresse;

    public Entreprise(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
