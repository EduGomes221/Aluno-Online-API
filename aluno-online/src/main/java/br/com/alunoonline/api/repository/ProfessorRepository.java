package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alunoonline.api.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}