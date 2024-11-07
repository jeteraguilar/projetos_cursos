package br.com.cadastro.pessoas.service;

import br.com.cadastro.pessoas.model.Pessoas;

@Service
public class PessoasService {
    @Autowired
    private PessoasRepository repository;

    public Pessoas criarPessoa(Pessoas pessoa) {
        return repository.save(pessoa);
    }

    public Pessoas atualizarPessoa(Long id, Pessoas pessoaAtualizada) {
        Pessoas pessoa = repository.findById(id).orElseThrow();
        pessoa.setNome(pessoaAtualizada.getNome());
        pessoa.setSobrenome(pessoaAtualizada.getSobrenome());
        pessoa.setAnoNascimento(pessoaAtualizada.getAnoNascimento());
        return repository.save(pessoa);
    }

    public Pessoas atualizarEndereco(Long id, Pessoas.Endereco endereco) {
        Pessoas pessoa = repository.findById(id).orElseThrow();
        pessoa.setEndereco(endereco);
        return repository.save(pessoa);
    }

    public void deletarPessoaLogico(Long id) {
        Pessoas pessoa = repository.findById(id).orElseThrow();
        pessoa.setAtivo(false);
        repository.save(pessoa);
    }

    public List<Pessoas> listarAtivos() {
        return repository.findByAtivoTrue();
    }
}
