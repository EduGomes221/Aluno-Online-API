package br.com.alunoonline.api.dtos;

import br.com.alunoonline.api.model.Disciplina;

public record DisciplinaResponseDTO(
        Long id,
        String nome,
        Integer cargaHoraria,
        Long professorId,
        String nomeProfessor
) {
    public static DisciplinaResponseDTO fromEntity(Disciplina disciplina) {
        return new DisciplinaResponseDTO(
                disciplina.getId(),
                disciplina.getNome(),
                disciplina.getCargaHoraria(),
                disciplina.getProfessor().getId(),
                disciplina.getProfessor().getNome()
        );
    }
}