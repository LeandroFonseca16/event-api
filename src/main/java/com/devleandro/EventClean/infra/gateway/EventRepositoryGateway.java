package com.devleandro.EventClean.infra.gateway;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.gateway.EventGateway;
import com.devleandro.EventClean.infra.mapper.EntityEventMapper;
import com.devleandro.EventClean.infra.persistence.EntityEvent;
import com.devleandro.EventClean.infra.persistence.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EntityEventMapper mapper;

    public EventRepositoryGateway(EventRepository eventRepository, EntityEventMapper entityEventMapper) {
        this.eventRepository = eventRepository;
        this.mapper = entityEventMapper;
    }

    @Override
    public Events createEvents(Events events) {
        EntityEvent entity = mapper.toEntity(events);
        EntityEvent newEvent = eventRepository.save(entity);
        return mapper.toDomain(newEvent);
    }

    @Override
    public List<Events> listEvent() {
        return eventRepository.findAll().stream().map(mapper::toDomain).toList();
    }

    @Override
    public boolean existsByIdentifier(String identifier) {
        return eventRepository.findAll().stream()
                .anyMatch(event -> event.getEventIdentity().equalsIgnoreCase(identifier));
    }

    @Override
    public Optional<EntityEvent> filterByIdentifier(String eventIdentity) {
        return eventRepository.findByEventIdentity(eventIdentity);
    }

//    @Override
//    public List<Events> listEvent() {
//        EntityEvent entity = mapper.toEntity(events);
//        List<EntityEvent> searchEvent = eventRepository.findAll(entity);
//        return Collections.singletonList(mapper.toDomain((EntityEvent) searchEvent));
//    }



}

