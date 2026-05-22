package br.com.alunoonline.api.dtos;

import jakarta.validation.constraints.NotNull;

public record MatriculaRequestDTO(
        @NotNull(message = "O aluno e obrigatorio")
        Long alunoId,

        @NotNull(message = "A disciplina e obrigatoria")
        Long disciplinaId
) {
}