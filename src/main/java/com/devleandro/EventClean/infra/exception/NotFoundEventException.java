package com.devleandro.EventClean.infra.exception;

public class NotFoundEventException extends RuntimeException {

    public NotFoundEventException(String message) {
        super(message);
    }
}
