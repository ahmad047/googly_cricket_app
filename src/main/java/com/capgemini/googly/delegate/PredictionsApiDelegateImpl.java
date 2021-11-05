package com.capgemini.googly.delegate;

import com.capgemini.googly.generated.api.PredictionsApiDelegate;
import com.capgemini.googly.generated.model.Prediction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PredictionsApiDelegateImpl implements PredictionsApiDelegate {

    @Override
    public ResponseEntity<Prediction> getPredictedWinner(Long teamOneId, Long teamTwoId) {
        return PredictionsApiDelegate.super.getPredictedWinner(teamOneId, teamTwoId);
    }

    @Override
    public ResponseEntity<List<Prediction>> getPredictions() {
        return PredictionsApiDelegate.super.getPredictions();
    }
}
