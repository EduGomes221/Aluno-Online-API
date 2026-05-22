package br.com.alunoonline.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alunoonline.api.controller.repository.AlunoRepository;
import br.com.alunoonline.api.model.Aluno;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno aluno) {
        aluno.setId(id);
        return repository.save(aluno);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}