package com.devleandro.EventClean.infra.persistence;

import com.devleandro.EventClean.core.entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface EventRepository extends JpaRepository <EntityEvent, Long> {

    Optional<EntityEvent> findByEventIdentity(String eventIdentity);

}
