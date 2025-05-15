package com.Evaluation.backend.repositories;

import com.Evaluation.backend.model.Tuteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuteurRepository extends JpaRepository<Tuteur, Long> {

}
