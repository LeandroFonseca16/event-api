package com.devleandro.EventClean.infra.beans;

import com.devleandro.EventClean.core.gateway.GatewayEvent;
import com.devleandro.EventClean.core.usecases.CreateEventCaseImpl;
import com.devleandro.EventClean.core.usecases.CreateEventUsecase;
import com.devleandro.EventClean.core.usecases.SearchEventCaseImpl;
import com.devleandro.EventClean.core.usecases.SearchEventUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEventUsecase createEvent(GatewayEvent gatewayEvent){
        return new CreateEventCaseImpl(gatewayEvent);
    }


}



