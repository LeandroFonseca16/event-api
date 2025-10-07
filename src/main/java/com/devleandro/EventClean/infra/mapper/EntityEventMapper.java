package com.devleandro.EventClean.infra.mapper;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.infra.persistence.EntityEvent;
import org.springframework.stereotype.Component;

@Component
public class EntityEventMapper {

    public EntityEvent toEntity(Events events){
        return new EntityEvent(
                events.id(),
                events.name(),
                events.description(),
                events.startAt(),
                events.endAt(),
                events.capacity(),
                events.eventLocal(),
                events.organizer(),
                events.event_identity(),
                events.eventType()
        );
    }

    public Events toDomain (EntityEvent entityEvent) {
        return new Events(
                entityEvent.getId(),
                entityEvent.getName(),
                entityEvent.getDescription(),
                entityEvent.getStartAt(),
                entityEvent.getEndAt(),
                entityEvent.getCapacity(),
                entityEvent.getEventLocal(),
                entityEvent.getOrganizer(),
                entityEvent.getEventIdentity(),
                entityEvent.getEventType()
        );
    }
}
