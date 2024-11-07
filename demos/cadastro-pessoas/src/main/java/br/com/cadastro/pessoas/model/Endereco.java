package br.com.cadastro.pessoas.model;

@Embeddable
public class Endereco {
    @NotBlank
    private String rua;

    @NotBlank
    private String cidade;

    @NotBlank
    private String estado;

    private String numero;
    private String complemento;

    // Getters e setters
}