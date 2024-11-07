package br.com.jet;

import br.com.jet.dao.DespesaDAO;
import br.com.jet.model.Categoria;
import br.com.jet.model.Despesa;

import java.time.LocalDate;
import java.util.Optional;

public class AtualizarDespesa {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
        Optional<Despesa> despesaOptional = dao.findById(5L);

        Despesa despesa = despesaOptional.get();
        System.out.println(despesa.getId());
        System.out.println(despesa.getDescricao());
        System.out.println(despesa.getData());
        System.out.println(despesa.getValor());
        System.out.println(despesa.getCategoria());

//        despesa.setDescricao("Gasto com dentista");
//        despesa.setData(LocalDate.of(2021, 6, 14));
//        despesa.setValor(250);
//        despesa.setCategoria(Categoria.OUTROS);
//
//        dao.update(despesa);
    }
}
