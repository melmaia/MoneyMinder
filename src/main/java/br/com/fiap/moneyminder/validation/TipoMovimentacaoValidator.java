package br.com.fiap.moneyminder.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


// Implementação do validador para a anotação TipoMovimentacao
public class TipoMovimentacaoValidator implements ConstraintValidator<TipoMovimentacao, String> {

    // Método que verifica se o valor da movimentação é válido
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // Retorna verdadeiro se o valor for "ENTRADA" ou "SAIDA", falso caso contrário
        return value.equals("ENTRADA") || value.equals("SAIDA");
    }

}
