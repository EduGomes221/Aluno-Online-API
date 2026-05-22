package br.com.alunoonline.api.dtos;

import br.com.alunoonline.api.model.Curso;

public record CursoResponseDTO(
        Long id,
        String nome,
        String codigo,
        Integer cargaHoraria,
        String descricao
) {
    public static CursoResponseDTO fromEntity(Curso curso) {
        return new CursoResponseDTO(
                curso.getId(),
                curso.getNome(),
                curso.getCodigo(),
                curso.getCargaHoraria(),
                curso.getDescricao()
        );
    }
}