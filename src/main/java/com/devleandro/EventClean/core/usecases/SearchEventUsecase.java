package com.devleandro.EventClean.core.usecases;

import com.devleandro.EventClean.core.entities.Events;

import java.util.List;

public interface SearchEventUsecase {
    List<Events> execute();
}
