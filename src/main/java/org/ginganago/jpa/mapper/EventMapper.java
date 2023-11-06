package org.ginganago.jpa.mapper;

import org.ginganago.domain.EventDto;
import org.ginganago.model.Event;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class EventMapper {

    @Mapping(target = "name", source = "name")
    public abstract EventDto toDto(Event event);
}
