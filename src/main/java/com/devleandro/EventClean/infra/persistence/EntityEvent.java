package com.devleandro.EventClean.infra.persistence;

import com.devleandro.EventClean.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Events")
public class EntityEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private Integer capacity;
    private String eventLocal;
    private String organizer;


    @Column(name = "event_identity", unique = true, nullable = false)
    private String eventIdentity;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;

}
