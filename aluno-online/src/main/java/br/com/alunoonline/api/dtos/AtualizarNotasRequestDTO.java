package br.com.alunoonline.api.dtos;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;

public record AtualizarNotasRequestDTO(
        @DecimalMin(value = "0.0", message = "A nota1 deve ser maior ou igual a 0")
        @DecimalMax(value = "10.0", message = "A nota1 deve ser menor ou igual a 10")
        Double nota1,

        @DecimalMin(value = "0.0", message = "A nota2 deve ser maior ou igual a 0")
        @DecimalMax(value = "10.0", message = "A nota2 deve ser menor ou igual a 10")
        Double nota2
) {
}