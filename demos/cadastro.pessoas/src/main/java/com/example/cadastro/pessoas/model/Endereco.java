package com.example.cadastro.pessoas.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Endereco {
    @NotBlank
    private String rua;

    @NotBlank
    private String cidade;

    @NotBlank
    private String estado;

    @NotBlank
    private String numero;

    private String complemento;

    // Getters e Setters
}