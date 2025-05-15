package com.Evaluation.backend.model;

import jakarta.persistence.*;

// Entité Categorie
@Entity
public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;
    private String intitule;
    private int valeur;

    public Categorie() {
    }

    public Categorie(String intitule, int valeur) {
        this.intitule = intitule;
        this.valeur = valeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}