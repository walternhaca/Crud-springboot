package com.example.crud.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // marca a classe como um controller
@RequestMapping("/product") //especifica a url que o metodo controlador ira manipular
public class ProductController {

    @GetMapping
    //Response Enttity eh uma classe padrao para montar respostas para o cliente
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok( "Deu Ok");
    }
}
