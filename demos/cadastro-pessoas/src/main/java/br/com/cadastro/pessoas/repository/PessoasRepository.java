package br.com.cadastro.pessoas.repository;

import com.exemplo.pessoas.model.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoasRepository extends JpaRepository<Pessoas, Long> {
    List<Pessoas> findByAtivoTrue();
}
