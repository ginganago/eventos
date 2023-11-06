package org.ginganago.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;
import org.ginganago.domain.EventDto;
import org.ginganago.service.EventService;

@ApplicationScoped
@RequiredArgsConstructor
@Path("/api/v1/events")
public class EventController {
    private final EventService eventService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path(("{id}"))
    public EventDto getById(@PathParam("id") Long id) {
        return eventService.getById(id);
    }
}
