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
import java.util.Optional;

@Component
@AllArgsConstructor
public class PredictionsApiDelegateImpl implements PredictionsApiDelegate {

    private final PredictionService predictionService;

    @Override
    public ResponseEntity<Prediction> getPredictedWinner(Long teamOneId, Long teamTwoId) {
        Prediction prediction = predictionService.getPredictedWinner(teamOneId, teamTwoId);
        return ResponseEntity.status(HttpStatus.OK).body(prediction);
    }

    @Override
    public ResponseEntity<List<Prediction>> getPredictions() {
        List<Prediction> predictions = predictionService.getAllPredictions();
        return ResponseEntity.status(HttpStatus.OK).body(predictions);
    }

    @Override
    public ResponseEntity<Prediction> getPredictionById(Long predictionId) {
        Prediction prediction = predictionService.getPredictionById(predictionId);
        return ResponseEntity.status(HttpStatus.OK).body(prediction);
    }
}
