package com.capgemini.googly.delegate;

import com.capgemini.googly.generated.api.PredictionsApiDelegate;
import com.capgemini.googly.generated.model.Prediction;
import com.capgemini.googly.repository.PredictionRepository;
import com.capgemini.googly.service.PredictionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PredictionsApiDelegateImpl implements PredictionsApiDelegate {

    private final PredictionService predictionService;

    @Override
    public ResponseEntity<Prediction> getPredictedWinner(Long teamOneId, Long teamTwoId) {
        return PredictionsApiDelegate.super.getPredictedWinner(teamOneId, teamTwoId);
    }

    @Override
    public ResponseEntity<List<Prediction>> getPredictions() {
        List<Prediction> predictions = predictionService.getAllPredictions();
        return ResponseEntity.status(HttpStatus.OK).body(predictions);
    }



}
