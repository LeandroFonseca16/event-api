package com.devleandro.EventClean.core.usecases;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.gateway.EventGateway;
import com.devleandro.EventClean.infra.exception.NotFoundEventException;
import com.devleandro.EventClean.infra.persistence.EntityEvent;

public class FilterIdentifierEventCaseImpl implements FilterIdentifierEventUseCase {

    private final EventGateway eventGateway;


    public FilterIdentifierEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public EntityEvent execute(String identifier) {
       return eventGateway.filterByIdentifier(identifier)
               .orElseThrow(() -> new NotFoundEventException("Evento com identificador: " + identifier + " não encontrado."));
    }
}
