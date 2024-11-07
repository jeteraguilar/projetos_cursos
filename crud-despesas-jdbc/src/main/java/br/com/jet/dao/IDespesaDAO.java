package br.com.jet.dao;

import br.com.jet.model.Categoria;
import br.com.jet.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesaDAO {

    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(Long id);
    List<Despesa> findByCategoria(Categoria categoria);
}
