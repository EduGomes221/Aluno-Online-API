package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
public class Aluno {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String nome;
    @Setter
    private String email;
    private String cpf;
    private String matricula;
    private String telefone;



    public Long getId() { return id; }

    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTelefone() {
        return telefone;
    }
}