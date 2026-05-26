package br.com.alunoonline.api.dtos;

import br.com.alunoonline.api.enums.StatusMatricula;

public record DisciplinaHistoricoResponseDTO(
        String nomeDisciplina,
        String nomeProfessor,
        Double nota1,
        Double nota2,
        Double media,
        StatusMatricula status
) {
}