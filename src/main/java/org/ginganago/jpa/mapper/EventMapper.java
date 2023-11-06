package org.ginganago.jpa.mapper;

import org.ginganago.domain.EventDto;
import org.ginganago.model.Event;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfig.class)
public interface EventMapper {

    EventDto toDto(Event event);
}
