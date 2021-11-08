package com.capgemini.googly.delegate;

import com.capgemini.googly.generated.api.TeamsApiDelegate;
import com.capgemini.googly.generated.model.Team;
import com.capgemini.googly.repositories.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TeamsApiDelegateImpl implements TeamsApiDelegate {
    private final TeamRepository teamRepository;

    @Override
    public ResponseEntity<Team> getTeamById(Long teamId) {
        return TeamsApiDelegate.super.getTeamById(teamId);
    }

    @Override
    public ResponseEntity<List<Team>> getTeams() {
        List<Team> teams = teamRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(teams);
    }
}
