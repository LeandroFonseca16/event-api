package com.devleandro.EventClean.infra.presentation;


import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.usecases.CreateEventUsecase;
import com.devleandro.EventClean.core.usecases.SearchEventUsecase;
import com.devleandro.EventClean.infra.dtos.DtoEvent;
import com.devleandro.EventClean.infra.mapper.DtoEventMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class EventController {

    private final CreateEventUsecase createEventCase;
    private final SearchEventUsecase searchEventCase;
    private final DtoEventMapper dtoEventMapper;

    public EventController(CreateEventUsecase createEventCase, SearchEventUsecase searchEventCase, DtoEventMapper dtoEventMapper) {
        this.createEventCase = createEventCase;
        this.searchEventCase = searchEventCase;
        this.dtoEventMapper = dtoEventMapper;
    }

    @PostMapping("createevent") //dto clean architecture
    public DtoEvent createEvent(@RequestBody DtoEvent dtoEvent) {
        Events newEvent = createEventCase.execute(dtoEventMapper.toEntities(dtoEvent));
        return dtoEventMapper.toDto(newEvent);
    }

    @GetMapping("searchevent")
    public List<DtoEvent> searchEvent(){
        return searchEventCase.execute().stream().map(dtoEventMapper::toDto).collect(Collectors.toList());
    }
}
