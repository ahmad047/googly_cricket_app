package com.capgemini.googly.service;

import com.capgemini.googly.entity.PredictionEntity;
import com.capgemini.googly.entity.TeamEntity;
import com.capgemini.googly.generated.model.Prediction;
import com.capgemini.googly.generated.model.Team;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class PredictWinner {
    public PredictionEntity predictWinner(Team teamOne, Team teamTwo){


        PredictionEntity predictionEntity = new PredictionEntity(teamOne.getId(), teamTwo.getId(), LocalDate.now(),
                teamOne.getId(), 75D);
        return predictionEntity;
    }

//    public HashMap<String, Integer> rankings(String teamOneName, String teamTwoName){
//        fetch(https://cricket.sportmonks.com/api/v2.0/team-rankings?api_token=TGhymWCwRhpEpQtKtx1XP8ZzQ7CBoHhOMG6G0L6pUQugu8Oev7SfFQCedCYS)
//    }
}
