package com.capgemini.googly.repositories;

import com.capgemini.googly.generated.model.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredictionRepository extends JpaRepository<Prediction, Long> {
}
