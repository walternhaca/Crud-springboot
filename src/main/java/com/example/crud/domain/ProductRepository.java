package com.example.crud.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//pra manipular as tabelas usamos as interfaces repository's
//A interface do JpaRepository cria todos os metodos em runtime e para crirar precisa receber a entidade da qual vai manipular e o tipo de primary key
public interface ProductRepository extends JpaRepository<Product , String> {
    List<Product> findAllByActiveTrue();
}
