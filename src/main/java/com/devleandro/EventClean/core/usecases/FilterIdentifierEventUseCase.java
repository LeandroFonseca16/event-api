package com.devleandro.EventClean.core.usecases;
import com.devleandro.EventClean.core.entities.Events;
import com.devleandro.EventClean.infra.persistence.EntityEvent;

public interface FilterIdentifierEventUseCase {
    public EntityEvent execute(String identifier);
}
