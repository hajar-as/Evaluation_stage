package com.Evaluation.backend.repositories;

import com.Evaluation.backend.model.Appreciation;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AppreciationRepository extends JpaRepository<Appreciation, Long> {

}
