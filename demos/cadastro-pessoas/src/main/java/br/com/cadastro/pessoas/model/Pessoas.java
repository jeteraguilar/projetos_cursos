package br.com.cadastro.pessoas.model;

import java.time.LocalDate;

@Entity
public class Pessoas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String sobrenome;

    @Past
    private LocalDate anoNascimento;

    @Embedded
    private Endereco endereco;

    private Boolean ativo = true;

    // Getters e setters
}
