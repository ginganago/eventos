package org.ginganago.jpa.repository;

import org.ginganago.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
