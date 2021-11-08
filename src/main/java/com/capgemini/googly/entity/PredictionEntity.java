package com.capgemini.googly.entity;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@ToString
@NoArgsConstructor
public class PredictionEntity {
    @Id
    @GeneratedValue
    private long id;
    private Long teamOneId;

    private Long teamTwoId;

    private LocalDate dateOfPrediction;

    private Long winner;

    private Double winCertainty;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getTeamOneId() {
        return teamOneId;
    }

    public void setTeamOneId(Long teamOneId) {
        this.teamOneId = teamOneId;
    }

    public Long getTeamTwoId() {
        return teamTwoId;
    }

    public void setTeamTwoId(Long teamTwoId) {
        this.teamTwoId = teamTwoId;
    }

    public LocalDate getDateOfPrediction() {
        return dateOfPrediction;
    }

    public void setDateOfPrediction(LocalDate dateOfPrediction) {
        this.dateOfPrediction = dateOfPrediction;
    }

    public Long getWinner() {
        return winner;
    }

    public void setWinner(Long winner) {
        this.winner = winner;
    }

    public Double getWinCertainty() {
        return winCertainty;
    }

    public void setWinCertainty(Double winCertainty) {
        this.winCertainty = winCertainty;
    }

    public PredictionEntity(Long teamOneId, Long teamTwoId, LocalDate dateOfPrediction, Long winner, Double winCertainty) {
        this.teamOneId = teamOneId;
        this.teamTwoId = teamTwoId;
        this.dateOfPrediction = dateOfPrediction;
        this.winner = winner;
        this.winCertainty = winCertainty;
    }
}
