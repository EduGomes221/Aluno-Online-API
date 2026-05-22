package br.com.alunoonline.api.dtos;

import jakarta.validation.constraints.NotBlank;

public record CursoRequestDTO(
        @NotBlank(message = "O nome e obrigatorio")
        String nome,

        @NotBlank(message = "O codigo e obrigatorio")
        String codigo,

        Integer cargaHoraria,

        String descricao
) {
}