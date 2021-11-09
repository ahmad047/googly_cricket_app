package com.capgemini.googly.feignclients;

import com.capgemini.googly.generated.model.Team;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "sportsmonks", url = "https://cricket.sportmonks.com/api/v2.0")
public interface SportsMonks {

    @RequestMapping(method = RequestMethod.GET, value = "/team-rankings?api_token=TGhymWCwRhpEpQtKtx1XP8ZzQ7CBoHhOMG6G0L6pUQugu8Oev7SfFQCedCYS")
    List<Object> getTeams();

}
