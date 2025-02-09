package com.example.crud.infra;

import lombok.Getter;

@Getter
public class ExceptionDTO {
    private  String message;

    public ExceptionDTO (String message){
        this.message = message;
    }
}
