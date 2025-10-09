package com.devleandro.EventClean.core.entities;

import com.devleandro.EventClean.core.enums.EventType;

import java.time.LocalDateTime;
import java.util.Date;




public record Events(
        Long id,
        String name,
        String description,
        LocalDateTime startAt,
        LocalDateTime endAt,
        Integer capacity,
        String eventLocal,
        String organizer,
        String event_identity,
        EventType eventType
) {





    //desafio, tudo que está no core da aplicacao nao pode ter nada externo (java puro, sem spring)
    // nome do evento, descricao, inicio/fim do evento, id do evento, local, capacidade, tipo de evento (networking, musica, comicon, palestra, qualquer tag) etc
}
