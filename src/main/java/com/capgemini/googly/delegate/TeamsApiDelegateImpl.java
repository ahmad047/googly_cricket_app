package com.capgemini.googly.delegate;

import com.capgemini.googly.generated.api.TeamsApiDelegate;
import com.capgemini.googly.generated.model.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TeamsApiDelegateImpl implements TeamsApiDelegate {

    @Override
    public ResponseEntity<Team> getTeamById(Long teamId) {
        return TeamsApiDelegate.super.getTeamById(teamId);
    }

    @Override
    public ResponseEntity<List<Team>> getTeams() {
        return TeamsApiDelegate.super.getTeams();
    }
}
