package com.devleandro.EventClean.infra.dtos;

import com.devleandro.EventClean.core.enums.EventType;

import java.time.LocalDateTime;

public record EventDto(
        Long id,
        String name,
        String description,
        LocalDateTime startAt,
        LocalDateTime endAt,
        Integer capacity,
        String eventLocal,
        String organizer,
        String event_identity,
        EventType eventType
) {

}
