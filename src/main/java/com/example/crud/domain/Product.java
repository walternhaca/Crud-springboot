package com.example.crud.domain;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product") // nome da tabela
@Entity(name = "product") // nome da entidade
@Getter //cria metodos get automaticamente
@Setter // cria metodos setters automaticamente
@AllArgsConstructor // cria os construtores
@NoArgsConstructor // cria o construtor que nao recebe nenhum parametro e nao seta nada
@EqualsAndHashCode(of = "id") //Indica a chave primaria e eh anotacao do lombok
//criamos as nossas entidades dentro da pasta domain que seria o dominio da nossa aplicacao, uma entidade representa uma tabela que por sua vez representa um objecto
public class Product {
    @Id //indica o atributo id
    @GeneratedValue(strategy = GenerationType.UUID) //estrategia para criar id automaticamente
    private String id;

    private String name;

    private Number price_in_cents;
}
