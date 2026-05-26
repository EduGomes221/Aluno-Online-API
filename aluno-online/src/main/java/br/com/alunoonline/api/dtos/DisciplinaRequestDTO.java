package br.com.alunoonline.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DisciplinaRequestDTO(
        @NotBlank(message = "O nome e obrigatorio")
        String nome,

        Integer cargaHoraria,

        @NotNull(message = "O professor e obrigatorio")
        Long professorId
) {
}