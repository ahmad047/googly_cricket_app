package com.capgemini.googly.repository;

import com.capgemini.googly.entity.PredictionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredictionRepository extends JpaRepository<PredictionEntity, Long> {
}
