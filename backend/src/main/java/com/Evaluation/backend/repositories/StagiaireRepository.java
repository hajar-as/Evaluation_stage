package com.Evaluation.backend.repositories;


import com.Evaluation.backend.model.Stagiaire;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface StagiaireRepository extends JpaRepository<Stagiaire, Long> {

}
