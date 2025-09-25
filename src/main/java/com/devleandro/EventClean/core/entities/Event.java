package com.devleandro.EventClean.core.entities;

import com.devleandro.EventClean.core.enums.EventType;

import java.time.LocalDateTime;
import java.util.Date;


public record Event(
        String name,
        Long id,
        String description,
        LocalDateTime startAt, Date endAt,
        Integer capacity,
        String local,
        String organizer,
        EventType type,
        String identity
) {





    //desafio, tudo que está no core da aplicacao nao pode ter nada externo (java puro, sem spring)
    // nome do evento, descricao, inicio/fim do evento, id do evento, local, capacidade, tipo de evento (networking, musica, comicon, palestra, qualquer tag) etc
}
