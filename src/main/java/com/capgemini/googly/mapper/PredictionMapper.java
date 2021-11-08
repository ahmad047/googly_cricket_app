package com.capgemini.googly.mapper;

import com.capgemini.googly.entity.PredictionEntity;
import com.capgemini.googly.generated.model.Prediction;
import com.capgemini.googly.generated.model.Team;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper
public interface PredictionMapper {

    PredictionMapper INSTANCE = Mappers.getMapper(PredictionMapper.class);

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "teamOneId", source = "teamOneId"),
            @Mapping(target = "teamTwoId", source = "teamTwoId"),
            @Mapping(target = "dateOfPrediction", source = "dateOfPrediction"),
            @Mapping(target = "winner", source = "winner"),
            @Mapping(target = "winCertainty", source = "winCertainty")
    })
    PredictionEntity mapTo(Prediction prediction);

    @InheritInverseConfiguration
    Prediction mapTo(PredictionEntity predictionEntity);
}
