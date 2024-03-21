package br.com.fiap.moneyminder.validation;

import static org.springframework.http.HttpStatus.*;

import java.util.List;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// Classe para lidar com erros de validação em requisições REST
@RestControllerAdvice
public class ValidationErrorHandler {

    // Classe interna para representar erros de validação
    record ValidationError(String campo, String mensagem){
        public ValidationError(FieldError error){
            this(error.getField(), error.getDefaultMessage());
        }
    };

    // Método para lidar com exceções MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(BAD_REQUEST)
    public List<ValidationError> handleMethodArgumentNotValid(MethodArgumentNotValidException exception){

        // Mapeia os erros de campo para a classe ValidationError
        return exception
            .getFieldErrors()
            .stream()
            .map(ValidationError::new)
            .toList();

    }

}
