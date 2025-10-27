package com.devleandro.EventClean.core.usecases;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.gateway.EventGateway;
import com.devleandro.EventClean.core.services.EventIdGenerator;
import com.devleandro.EventClean.infra.exception.DuplicateKeyException;

public class CreateEventCaseImpl implements CreateEventUsecase {

    private final EventGateway gatewayEvent;
    private final EventIdGenerator idGenerator;

    public CreateEventCaseImpl(EventGateway gatewayEvent, EventIdGenerator idGenerator) {
        this.gatewayEvent = gatewayEvent;
        this.idGenerator = idGenerator;
    }

    @Override
    public Events execute(Events event) {

        String identity = event.event_identity();
        if (identity == null || identity.isBlank()) {
            identity = idGenerator.generate();
        }

        if (gatewayEvent.existsByIdentifier(identity)) {
            throw new DuplicateKeyException("O identificador " + identity + " já está em uso para outro evento.");
        }

        Events eventWithIdentity = new Events(
                event.id(),
                event.name(),
                event.description(),
                event.startAt(),
                event.endAt(),
                event.capacity(),
                event.eventLocal(),
                event.organizer(),
                identity,
                event.eventType()
        );

        return gatewayEvent.createEvents(eventWithIdentity);
    }
}
