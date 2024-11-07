package com.example.cadastro.pessoas.service;

import com.example.cadastro.pessoas.model.Endereco;
import com.example.cadastro.pessoas.model.Pessoa;
import com.example.cadastro.pessoas.repository.PessoaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarPessoasAtivas() {
        return pessoaRepository.findAllByAtivoTrue();
    }

    public Optional<Pessoa> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    @Transactional
    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Transactional
    public Pessoa atualizar(Long id, Pessoa pessoaAtualizada) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow();
        pessoa.setNome(pessoaAtualizada.getNome());
        pessoa.setSobrenome(pessoaAtualizada.getSobrenome());
        pessoa.setAnoNascimento(pessoaAtualizada.getAnoNascimento());
        pessoa.setEndereco(pessoaAtualizada.getEndereco());
        return pessoaRepository.save(pessoa);
    }

    @Transactional
    public Pessoa atualizarEndereco(Long id, Endereco endereco) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow();
        pessoa.setEndereco(endereco);
        return pessoaRepository.save(pessoa);
    }

    @Transactional
    public void deletarLogicamente(Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow();
        pessoa.setAtivo(false);
        pessoaRepository.save(pessoa);
    }
}
