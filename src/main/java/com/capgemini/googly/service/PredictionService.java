package com.capgemini.googly.service;

import com.capgemini.googly.entity.PredictionEntity;
import com.capgemini.googly.generated.model.Prediction;
import com.capgemini.googly.generated.model.Team;
import com.capgemini.googly.mapper.PredictionMapper;
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
    private final TeamService teamService;
    private final PredictWinner predictWinner;

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

    public Prediction getPredictedWinner(Long teamOneId, Long teamTwoId) {
        Team teamOne = teamService.getTeamById(teamOneId);
        Team teamTwo = teamService.getTeamById(teamTwoId);
        PredictionEntity predictionEntity = predictWinner.predictWinner(teamOne, teamTwo);
        Prediction prediction = PredictionMapper.INSTANCE.mapTo(predictionEntity);
        return prediction;
    }

}
