package com.devleandro.EventClean.core.usecases;

import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.core.gateway.GatewayEvent;

import java.util.List;

public class SearchEventCaseImpl implements SearchEventUsecase {

    private final GatewayEvent gatewayEvent;

    public SearchEventCaseImpl(GatewayEvent gatewayEvent) {
        this.gatewayEvent = gatewayEvent;
    }

}
