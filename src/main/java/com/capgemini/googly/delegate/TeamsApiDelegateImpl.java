package com.capgemini.googly.delegate;

import com.capgemini.googly.generated.api.TeamsApiDelegate;
import com.capgemini.googly.generated.model.Team;
import com.capgemini.googly.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class TeamsApiDelegateImpl implements TeamsApiDelegate {
    private final TeamService teamService;

    @Override
    public ResponseEntity<Optional<Team>> getTeamById(Long teamId) {
        Optional<Team> team = Optional.ofNullable(teamService.getTeamById(teamId));
        return ResponseEntity.status(HttpStatus.OK).body(team);
    }

    @Override
    public ResponseEntity<List<Team>> getTeams() {
        List<Team> teams = teamService.getAllTeams();
        return ResponseEntity.status(HttpStatus.OK).body(teams);
    }
}
