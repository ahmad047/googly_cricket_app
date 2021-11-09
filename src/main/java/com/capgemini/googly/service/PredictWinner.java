package com.capgemini.googly.service;

import com.capgemini.googly.entity.PredictionEntity;
import com.capgemini.googly.exception.ResourceNotFoundException;
import com.capgemini.googly.feignclients.SportsMonks;
import com.capgemini.googly.generated.model.Team;
import com.capgemini.googly.model.Ranking;
import com.capgemini.googly.model.Response;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class PredictWinner {
    private SportsMonks sportsmonks;

    public PredictionEntity predictWinner(Team teamOne, Team teamTwo) {
        Response response = sportsmonks.getTeams();
        List<Ranking> rankings = response.getData().get(0).getTeam();
        Integer teamOneRanking = null;
        Integer teamTwoRanking = null;
        for (Ranking ranking : rankings) {
            if (Objects.equals(ranking.getName(), teamOne.getName())) {
                teamOneRanking = ranking.getPosition();
            } else if (Objects.equals(ranking.getName(), teamTwo.getName())) {
                teamTwoRanking = ranking.getPosition();
            }
        }

        if (teamOneRanking == null) {
            throw new ResourceNotFoundException(teamOne.getName(), teamOne.getName(), teamOne.getId());
        }

        if (teamTwoRanking == null) {
            throw new ResourceNotFoundException(teamTwo.getName(), teamTwo.getName(), teamTwo.getId());
        }

        Long winner;
        Double winCertainty;

        if (teamOneRanking > teamTwoRanking) {
            winner = teamTwo.getId();
            winCertainty = 50D + (teamOneRanking - teamTwoRanking) * 2.75;
        } else {
            winner = teamOne.getId();
            winCertainty = 50D + (teamTwoRanking - teamOneRanking) * 2.75;
        }

        return new PredictionEntity(teamOne.getId(), teamTwo.getId(), LocalDate.now(), winner, winCertainty);
    }
}
