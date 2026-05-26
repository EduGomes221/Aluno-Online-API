package br.com.alunoonline.api.dtos;

import br.com.alunoonline.api.model.Aluno;

public record AlunoResponseDTO(
        Long id,
        String nome,
        String email,
        String cpf,
        String matricula,
        String telefone
) {

    public static AlunoResponseDTO fromEntity(Aluno aluno) {

        return new AlunoResponseDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getEmail(),
                aluno.getCpf(),
                aluno.getMatricula(),
                aluno.getTelefone()
        );
    }
}