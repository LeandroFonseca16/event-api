package com.devleandro.EventClean.infra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {


    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateKeyExceptions(DuplicateKeyException exception){

        Map<String, String> response = new HashMap<>();
        response.put("Erro:", exception.getMessage());
        response.put("Message:", "Please, insert a valid hashId for your event and try again");

        return new ResponseEntity<>(response, HttpStatus.CONFLICT);

    }
}
