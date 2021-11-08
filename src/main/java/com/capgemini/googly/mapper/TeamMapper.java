package com.capgemini.googly.mapper;

import com.capgemini.googly.entity.TeamEntity;
import com.capgemini.googly.generated.model.Team;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    @Mappings({
        @Mapping(target = "id", source = "id"),
        @Mapping(target = "name", source = "name"),
        @Mapping(target = "type", source = "type")
    })
    TeamEntity mapTo(Team team);

    @InheritInverseConfiguration
    Team mapTo(TeamEntity teamEntity);
}
