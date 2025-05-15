package com.Evaluation.backend.model;
import jakarta.persistence.*;
// Entité Personne
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // utilise AUTO_INCREMENT natif de MySQL
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}