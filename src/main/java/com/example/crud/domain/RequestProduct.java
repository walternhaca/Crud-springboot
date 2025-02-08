package com.example.crud.domain;

//o record eh uma forma de criar uma classe que so tem artibutos sem implementacao de nada tambem eh chamdao dto(data transfer object- pra receber ou tranferir dados para o cliente)
public record RequestProduct(String name, Integer price_in_cents) {
}
