package com.devleandro.EventClean.infra.presentation;


import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.usecases.CreateEventUsecase;
import com.devleandro.EventClean.core.usecases.FilterIdentifierEventUseCase;
import com.devleandro.EventClean.core.usecases.SearchEventUsecase;
import com.devleandro.EventClean.infra.dtos.EventDto;
import com.devleandro.EventClean.infra.mapper.EventMapperDto;
import com.devleandro.EventClean.infra.persistence.EntityEvent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class EventController {

    private final CreateEventUsecase createEventCase;
    private final SearchEventUsecase searchEventCase;
    private final FilterIdentifierEventUseCase filterIdentifierEventUseCase;

    private final EventMapperDto dtoEventMapper;

    public EventController(CreateEventUsecase createEventCase, SearchEventUsecase searchEventCase, FilterIdentifierEventUseCase filterIdentifierEventUseCase, EventMapperDto dtoEventMapper) {
        this.createEventCase = createEventCase;
        this.searchEventCase = searchEventCase;
        this.filterIdentifierEventUseCase = filterIdentifierEventUseCase;
        this.dtoEventMapper = dtoEventMapper;
    }

    @PostMapping("createevent") //dto clean architecture
    public ResponseEntity<Map<String, Object>> createEvent(@RequestBody EventDto dtoEvent) {
        Events newEvent = createEventCase.execute(dtoEventMapper.toEntities(dtoEvent));
        Map<String, Object> response = new HashMap<>();
        response.put("Message:", "Evento cadastrado com sucesso no banco de dados.");
        response.put("Dados do evento:", dtoEventMapper.toDto(newEvent));
        return ResponseEntity.ok(response);
    }

    @GetMapping("searchevent")
    public List<EventDto> searchEvent(){
        return searchEventCase.execute().stream().map(dtoEventMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("identifier/{eventIdentity}")
    public ResponseEntity<EntityEvent> searchByIdentifier(@PathVariable String eventIdentity) {
        EntityEvent events = filterIdentifierEventUseCase.execute(eventIdentity);
        return ResponseEntity.ok(events);
    }
}
