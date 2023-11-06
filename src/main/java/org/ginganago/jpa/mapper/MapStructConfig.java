package org.ginganago.jpa.mapper;

import org.mapstruct.MapperConfig;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.JAKARTA_CDI;
import static org.mapstruct.ReportingPolicy.ERROR;

@MapperConfig(
        injectionStrategy = CONSTRUCTOR,
        unmappedTargetPolicy = ERROR,
        componentModel = JAKARTA_CDI
)
public class MapStructConfig {
}
