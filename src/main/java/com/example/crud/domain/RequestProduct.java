package com.example.crud.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//o record eh uma forma de criar uma classe que so tem artibutos sem implementacao de nada tambem eh chamdao dto(data transfer object- pra receber ou tranferir dados para o cliente)
public record RequestProduct(
        String id,
        @NotBlank //validacao pra que nao seja vazio
        String name,
        @NotNull //validacao pra que nao seja nulo
        Integer price_in_cents) {
}
