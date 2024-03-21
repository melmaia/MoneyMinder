package br.com.fiap.moneyminder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data // Lombok annotation para gerar getters, setters, equals, hashCode e toString automaticamente
@Entity // Indica que esta classe é uma entidade JPA
public class Categoria {

    @Id // Indica que este atributo é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // Define a estratégia de geração de valor automático para a chave primária
    private Long id; // Atributo para armazenar o ID da categoria

    @NotBlank(message = "{categoria.nome.notblank}") // Validação para garantir que o nome não esteja em branco
    private String nome; // Atributo para armazenar o nome da categoria

    private String icone; // Atributo para armazenar o ícone da categoria

}
