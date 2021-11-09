package com.capgemini.googly.service;

import com.capgemini.googly.entity.TeamEntity;
import com.capgemini.googly.exception.ResourceNotFoundException;
import com.capgemini.googly.generated.model.Team;
import com.capgemini.googly.mapper.TeamMapper;
import com.capgemini.googly.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository teamRepository;

    public Team getTeamById(Long id) {
        Optional<TeamEntity> teamEntity = Optional.ofNullable(teamRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Team", "id", id)));
        Team team = TeamMapper.INSTANCE.mapTo(teamEntity.get());
        return team;
    }

    public List<Team> getAllTeams() {
        List<TeamEntity> teamEntities = teamRepository.findAll();
        List<Team> teams = teamEntities.stream().map(TeamMapper.INSTANCE::mapTo).collect(Collectors.toList());
        return teams;
    }
}
