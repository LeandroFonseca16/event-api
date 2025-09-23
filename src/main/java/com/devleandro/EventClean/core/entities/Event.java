package com.devleandro.EventClean.core.entities;

public record Event() {

    //desafio, tudo que está no core da aplicacao nao pode ter nada externo (java puro, sem spring)
    // nome do evento, descricao, inicio/fim do evento, id do evento, local, capacidade, tipo de evento (networking, musica, comicon, palestra, qualquer tag) etc
}
