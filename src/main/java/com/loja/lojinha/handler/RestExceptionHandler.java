package com.loja.lojinha.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.loja.lojinha.model.ErroModel;
import com.loja.lojinha.model.exception.ResourceBadRequestException;
import com.loja.lojinha.model.exception.ResourceNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException ex){

        ErroModel erro = new ErroModel("Not Found", ex.getMessage(), 404 );

        return ResponseEntity.status(404).body(erro);
    }

    
    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<?> handlerResourceBadRequestException(ResourceBadRequestException ex){

        ErroModel erro = new ErroModel("Bad Request", ex.getMessage(), HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(404).body(erro);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handlerResourceException(Exception ex){

        ErroModel erro = new ErroModel("Internal Server Error", ex.getMessage(), 500 );

        return ResponseEntity.status(500).body(erro);
    }
    
}
