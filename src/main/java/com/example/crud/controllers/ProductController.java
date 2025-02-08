package com.example.crud.controllers;


import com.example.crud.domain.Product;
import com.example.crud.domain.ProductRepository;
import com.example.crud.domain.RequestProduct;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController // marca a classe como um controller
@RequestMapping("/product") //especifica a url que o metodo controlador ira manipular
public class ProductController {

    @Autowired //Indica ao spring para injetar  a dependecia ou seja criar uma instancia
    private ProductRepository repository;

    @GetMapping
    //Response Entity eh uma classe padrao para montar respostas para o cliente
    public ResponseEntity getAllProducts(){
        var allProducts = repository.findAll();
        return ResponseEntity.ok( allProducts);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProduct data){
        //@RequestBody indica ao spring que se quer pegar dados que vieram no body da requisicao
        //@Valid serve para validar se o corpo da requisicao esta correcto atraves da classe  RequestProduct que contem o formato dos dados
        Product newProduct = new Product(data); // pega o dto e cria o objecto
        repository.save(newProduct); //persiste na database
        return ResponseEntity.ok().build(); //quando nao se coloca nada dentro do statsus ok() temos que colocar build() no final
    }

    @PutMapping
    @Transactional //quando faremos mais de uma operacao e esperamos por um resultado
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data){
        Optional<Product> optionalProduct = repository.findById(data.id());
        if(optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice_in_cents(data.price_in_cents());
            return ResponseEntity.ok(product);
        } else{
            return  ResponseEntity.notFound().build();
        }

    }
}
