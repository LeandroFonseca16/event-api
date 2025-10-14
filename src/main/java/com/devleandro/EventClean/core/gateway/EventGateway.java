package com.devleandro.EventClean.core.gateway;

import com.devleandro.EventClean.core.entities.Events;

import java.util.List;

public interface EventGateway {

    Events createEvents (Events events);
    List<Events> listEvent();
    boolean existsByIdentifier(String identifier);
}
