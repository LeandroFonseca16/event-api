package com.devleandro.EventClean.infra.beans;

import com.devleandro.EventClean.core.gateway.EventGateway;
import com.devleandro.EventClean.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEventUsecase createEvent(EventGateway gatewayEvent){
        return new CreateEventCaseImpl(gatewayEvent);
    }

    @Bean
    public SearchEventUsecase searchEvent(EventGateway gatewayEvent){
        return new SearchEventCaseImpl(gatewayEvent);

    }

    @Bean
    public FilterIdentifierEventUseCase filterEvent(EventGateway eventGateway){
        return new FilterIdentifierEventCaseImpl(eventGateway);

    }


}



