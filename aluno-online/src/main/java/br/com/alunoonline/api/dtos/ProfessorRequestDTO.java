package br.com.alunoonline.api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ProfessorRequestDTO(
        @NotBlank(message = "O nome e obrigatorio")
        String nome,

        @Email(message = "E-mail invalido")
        @NotBlank(message = "O e-mail e obrigatorio")
        String email,

        @NotBlank(message = "O CPF e obrigatorio")
        String cpf,

        String especialidade,

        String titulacao
) {
}