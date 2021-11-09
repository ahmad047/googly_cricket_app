package com.capgemini.googly.model;

import java.util.List;

public class TeamRanking {
    public List<Ranking> getTeam() {
        return team;
    }

    public void setTeam(List<Ranking> team) {
        this.team = team;
    }

    List<Ranking> team;

    @Override
    public String toString() {
        return "TeamRanking{" +
                "teams=" + team +
                '}';
    }
}
