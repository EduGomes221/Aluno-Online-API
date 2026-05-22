package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alunoonline.api.repository.ProfessorRepository;
import br.com.alunoonline.api.model.Professor;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> listar() {
        return repository.findAll();
    }

    public Professor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Professor salvar(Professor professor) {
        return repository.save(professor);
    }

    public Professor atualizar(Long id, Professor professor) {
        professor.setId(id);
        return repository.save(professor);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}