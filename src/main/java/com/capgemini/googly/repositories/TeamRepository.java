package com.capgemini.googly.repositories;

import com.capgemini.googly.generated.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
