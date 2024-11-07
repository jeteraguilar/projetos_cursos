package com.example.cadastro.pessoas.controller;

import com.example.cadastro.pessoas.model.Endereco;
import com.example.cadastro.pessoas.model.Pessoa;
import com.example.cadastro.pessoas.service.PessoaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
@Validated
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> listarAtivos() {
        return pessoaService.listarPessoasAtivas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> buscarPorId(@PathVariable Long id) {
        return pessoaService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Pessoa criar(@Valid @RequestBody Pessoa pessoa) {
        return pessoaService.salvar(pessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> atualizar(@PathVariable Long id, @Valid @RequestBody Pessoa pessoa) {
        return ResponseEntity.ok(pessoaService.atualizar(id, pessoa));
    }

    @PatchMapping("/{id}/endereco")
    public ResponseEntity<Pessoa> atualizarEndereco(@PathVariable Long id, @Valid @RequestBody Endereco endereco) {
        return ResponseEntity.ok(pessoaService.atualizarEndereco(id, endereco));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        pessoaService.deletarLogicamente(id);
        return ResponseEntity.noContent().build();
    }
}