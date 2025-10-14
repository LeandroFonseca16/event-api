package com.devleandro.EventClean.infra.mapper;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.infra.dtos.EventDto;
import org.springframework.stereotype.Component;

@Component
public class EventMapperDto {

    public EventDto toDto(Events events){
        return new EventDto(
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

    public Events toEntities (EventDto dtoEvent){
        return new Events(
                dtoEvent.id(),
                dtoEvent.name(),
                dtoEvent.description(),
                dtoEvent.startAt(),
                dtoEvent.endAt(),
                dtoEvent.capacity(),
                dtoEvent.eventLocal(),
                dtoEvent.organizer(),
                dtoEvent.event_identity(),
                dtoEvent.eventType()
        );
    }
}
