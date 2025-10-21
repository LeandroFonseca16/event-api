package com.devleandro.EventClean.core.gateway;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.infra.persistence.EntityEvent;

import java.util.List;
import java.util.Optional;

public interface EventGateway {

    Optional<EntityEvent> filterByIdentifier(String eventIdentity);
    Events createEvents (Events events);
    List<Events> listEvent();
    boolean existsByIdentifier(String identifier);
}
