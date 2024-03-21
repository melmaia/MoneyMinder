package br.com.fiap.moneyminder.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;



// Define a anotação como aplicável a campos
@Target(FIELD)
// Indica que a anotação será retida em tempo de execução
@Retention(RUNTIME)
// Indica que esta anotação é uma restrição de validação e especifica o validador a ser usado
@Constraint(validatedBy = TipoMovimentacaoValidator.class)
public @interface TipoMovimentacao {

    // Mensagem padrão em caso de violação da restrição
    String message() default "Tipo inválido. Tipo deve ser ENTRADA ou SAIDA.";

    // Define grupos de validação. Não utilizado neste exemplo.
    Class<?>[] groups() default { };

    // Define informações adicionais sobre a validação. Não utilizado neste exemplo.
    Class<? extends Payload>[] payload() default { };
}
