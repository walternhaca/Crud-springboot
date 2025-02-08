package com.example.crud.controllers;


import com.example.crud.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // marca a classe como um controller
@RequestMapping("/product") //especifica a url que o metodo controlador ira manipular
public class ProductController {

    @Autowired //Indica ao spring para injetar  a dependecia ou seja criar uma instancia
    private ProductRepository repository;

    @GetMapping
    //Response Enttity eh uma classe padrao para montar respostas para o cliente
    public ResponseEntity getAllProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok( allProducts);
    }
}
