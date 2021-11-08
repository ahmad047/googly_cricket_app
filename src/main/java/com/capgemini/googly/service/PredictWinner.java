package com.capgemini.googly.service;

import com.capgemini.googly.entity.PredictionEntity;
import com.capgemini.googly.entity.TeamEntity;
import com.capgemini.googly.generated.model.Prediction;
import com.capgemini.googly.generated.model.Team;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PredictWinner {
    public PredictionEntity predictWinner(Team teamOne, Team teamTwo){
        PredictionEntity predictionEntity = new PredictionEntity(teamOne.getId(), teamTwo.getId(), LocalDate.now(),
                teamOne.getId(), 75D);

        return predictionEntity;
    }
}
