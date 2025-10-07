package com.devleandro.EventClean.core.usecases;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.gateway.GatewayEvent;


public class CreateEventCaseImpl implements CreateEventUsecase {


    private final GatewayEvent gatewayEvent;

    public CreateEventCaseImpl(GatewayEvent gatewayEvent) {
        this.gatewayEvent = gatewayEvent;
    }

    @Override
    public Events execute(Events event) {
        return gatewayEvent.createEvents(event);
    }

}
