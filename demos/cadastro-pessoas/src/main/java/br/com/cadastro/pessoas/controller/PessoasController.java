package br.com.cadastro.pessoas.controller;

@RestController
@RequestMapping("/api/pessoas")
public class PessoasController {
    @Autowired
    private PessoasService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoas criarPessoa(@Valid @RequestBody Pessoas pessoa) {
        return service.criarPessoa(pessoa);
    }

    @PutMapping("/{id}")
    public Pessoas atualizarPessoa(@PathVariable Long id, @Valid @RequestBody Pessoas pessoaAtualizada) {
        return service.atualizarPessoa(id, pessoaAtualizada);
    }

    @PatchMapping("/{id}/endereco")
    public Pessoas atualizarEndereco(@PathVariable Long id, @Valid @RequestBody Pessoas.Endereco endereco) {
        return service.atualizarEndereco(id, endereco);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarPessoaLogico(@PathVariable Long id) {
        service.deletarPessoaLogico(id);
    }

    @GetMapping
    public List<Pessoas> listarPessoasAtivas() {
        return service.listarAtivos();
    }
}
