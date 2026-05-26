package br.com.alunoonline.api.dtos;

import jakarta.validation.constraints.NotBlank;

public record AlunoRequestDTO(
        @NotBlank(message = "O nome e obrigatorio")
        String nome,

        @NotBlank(message = "O e-mail e obrigatorio")
        String email,

        @NotBlank(message = "O CPF e obrigatorio")
        String cpf,

        String matricula,

        String telefone
) {
}