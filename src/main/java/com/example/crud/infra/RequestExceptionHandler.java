package com.example.crud.infra;
//Eh um padrao deixar coisas de configuracao na pasta infra

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //Indica ao spring pra chamar esta classe quando uma excepcao for activada
public class RequestExceptionHandler {
    //Esta classe vai tratar das excepcoes das requisicoes

    @ExceptionHandler(EntityNotFoundException.class) //indica as excepcoes que a classe controla
    public ResponseEntity treat404(){
        var response = new ExceptionDTO("Dado nao encotrado");
        return ResponseEntity.badRequest().body(response);
    }
}
