package com.Evaluation.backend.model;

import jakarta.persistence.*;

// Entité Competence
@Entity
public class Competence {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;
    private String intitule;
    private int note;

    @ManyToOne
    private Categorie categorie;

    public Competence(String intitule, int note) {
        this.intitule = intitule;
        this.note = note;
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

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}