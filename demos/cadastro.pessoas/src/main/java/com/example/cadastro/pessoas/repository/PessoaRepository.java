package com.example.cadastro.pessoas.repository;

import com.example.cadastro.pessoas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    List<Pessoa> findAllByAtivoTrue();
}
