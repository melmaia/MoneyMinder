package br.com.fiap.moneyminder.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.moneyminder.validation.TipoMovimentacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data // Lombok annotation para gerar getters, setters, equals, hashCode e toString automaticamente
@Entity // Indica que esta classe é uma entidade JPA
public class Movimentacao {
    
    @Id // Indica que este atributo é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) // Define a estratégia de geração de valor automático para a chave primária
    private Long id; // Atributo para armazenar o ID da movimentação

    @NotBlank(message = "{movimentacao.descricao.notblank}") // Validação para garantir que a descrição não esteja em branco
    @Size(min = 3, message =  "{movimentacao.descricao.size}") // Validação para garantir que a descrição tenha pelo menos 3 caracteres
    private String descricao; // Atributo para armazenar a descrição da movimentação

    @Positive // Validação para garantir que o valor seja positivo
    private BigDecimal valor; // Atributo para armazenar o valor da movimentação

    private LocalDate data; // Atributo para armazenar a data da movimentação

    @TipoMovimentacao(message = "{movimentacao.tipo.tipomovimentacao}") // Validação personalizada para garantir que o tipo da movimentação seja válido
    private String tipo; // Atributo para armazenar o tipo da movimentação (ENTRADA | SAIDA)
    
}
