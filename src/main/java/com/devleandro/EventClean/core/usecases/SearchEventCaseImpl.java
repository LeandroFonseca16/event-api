package com.devleandro.EventClean.core.usecases;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.gateway.EventGateway;

import java.util.List;

public class SearchEventCaseImpl implements SearchEventUsecase {

    private final EventGateway gatewayEvent;

    public SearchEventCaseImpl(EventGateway gatewayEvent) {
        this.gatewayEvent = gatewayEvent;
    }

    @Override
    public List<Events> execute() {
        return gatewayEvent.listEvent();
    }
}
