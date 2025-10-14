package com.devleandro.EventClean.infra.beans;

import com.devleandro.EventClean.core.gateway.EventGateway;
import com.devleandro.EventClean.core.usecases.CreateEventCaseImpl;
import com.devleandro.EventClean.core.usecases.CreateEventUsecase;
import com.devleandro.EventClean.core.usecases.SearchEventCaseImpl;
import com.devleandro.EventClean.core.usecases.SearchEventUsecase;
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


}



