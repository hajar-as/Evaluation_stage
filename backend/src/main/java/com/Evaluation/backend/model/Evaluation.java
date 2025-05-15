package com.Evaluation.backend.model;

import jakarta.persistence.*;

// Entité Evaluation
@Entity
public class Evaluation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;
    private String categorie;
    private int valeur;

    public Evaluation(String categorie, int valeur) {
        this.categorie = categorie;
        this.valeur = valeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}