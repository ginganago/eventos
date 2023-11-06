package org.ginganago.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import org.ginganago.domain.EventDto;
import org.ginganago.exception.ErrorEnum;
import org.ginganago.exception.NotFoundException;
import org.ginganago.jpa.mapper.EventMapper;
import org.ginganago.jpa.repository.EventRepository;

@ApplicationScoped
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    private final EventMapper eventMapper;
    public EventDto getById(Long id) {
        return eventRepository.findById(id)
                .map(eventMapper::toDto)
                .orElseThrow(() -> new NotFoundException(ErrorEnum.NOT_FOUND_EVENT, id));
    }
}
