package org.ginganago.service;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class EventService {


    public String findById(Long id) {
        return "hello";
    }
}
