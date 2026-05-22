package br.com.alunoonline.api.dtos;

import br.com.alunoonline.api.enums.StatusMatricula;
import br.com.alunoonline.api.model.Matricula;

public record MatriculaAlunoResponseDTO(
        Long id,
        Long alunoId,
        String nomeAluno,
        Long disciplinaId,
        String nomeDisciplina,
        String nomeProfessor,
        Double nota1,
        Double nota2,
        Double media,
        StatusMatricula status
) {
    public static MatriculaAlunoResponseDTO fromEntity(Matricula matriculaAluno) {
        return new MatriculaAlunoResponseDTO(
                matriculaAluno.getId(),
                matriculaAluno.getAluno().getId(),
                matriculaAluno.getAluno().getNome(),
                matriculaAluno.getDisciplina().getId(),
                matriculaAluno.getDisciplina().getNome(),
                matriculaAluno.getDisciplina().getProfessor().getNome(),
                matriculaAluno.getNota1(),
                matriculaAluno.getNota2(),
                calcularMedia(matriculaAluno.getNota1(), matriculaAluno.getNota2()),
                matriculaAluno.getStatus()
        );
    }

    private static Double calcularMedia(Double nota1, Double nota2) {
        if (nota1 == null || nota2 == null) {
            return null;
        }

        return (nota1 + nota2) / 2;
    }
}