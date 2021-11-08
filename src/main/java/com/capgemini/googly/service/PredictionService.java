package com.capgemini.googly.service;

import com.capgemini.googly.entity.PredictionEntity;
import com.capgemini.googly.generated.model.Prediction;
import com.capgemini.googly.generated.model.Team;
import com.capgemini.googly.mapper.PredictionMapper;
import com.capgemini.googly.mapper.TeamMapper;
import com.capgemini.googly.repository.PredictionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PredictionService {
    private final PredictionRepository predictionRepository;

    public Prediction getPredictionById(Long id) {
        Optional<PredictionEntity> predictionEntity = predictionRepository.findById(id);
        Prediction prediction = PredictionMapper.INSTANCE.mapTo(predictionEntity.get());
        return prediction;
    }

    public List<Prediction> getAllPredictions() {
        List<PredictionEntity> predictionEntities = predictionRepository.findAll();
        List<Prediction> predictions = predictionEntities.stream().map(PredictionMapper.INSTANCE::mapTo).collect(Collectors.toList());
        return predictions;
    }
}
