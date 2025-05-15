package com.Evaluation.backend.repositories;

import com.Evaluation.backend.model.Periode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodeRepository extends JpaRepository<Periode, Long> {

}
