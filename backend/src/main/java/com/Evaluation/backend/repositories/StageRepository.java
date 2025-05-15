package com.Evaluation.backend.repositories;

import com.Evaluation.backend.model.Stage;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StageRepository extends JpaRepository<Stage, Long> {

}