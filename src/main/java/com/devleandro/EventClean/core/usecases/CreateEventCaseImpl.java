package com.devleandro.EventClean.core.usecases;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.gateway.EventGateway;
import com.devleandro.EventClean.infra.exception.DuplicateKeyException;


public class CreateEventCaseImpl implements CreateEventUsecase {


    private final EventGateway gatewayEvent;

    public CreateEventCaseImpl(EventGateway gatewayEvent) {
        this.gatewayEvent = gatewayEvent;
    }

    @Override
    public Events execute(Events event) {

        if(gatewayEvent.existsByIdentifier(event.event_identity())){
            throw new DuplicateKeyException("O identificador de número " + event.event_identity() + " já está em uso para outro evento.");
        }
        return gatewayEvent.createEvents(event);
    }

}
