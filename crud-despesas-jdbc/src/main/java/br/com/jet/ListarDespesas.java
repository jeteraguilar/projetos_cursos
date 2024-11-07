package br.com.jet;

import br.com.jet.dao.DespesaDAO;
import br.com.jet.model.Categoria;
import br.com.jet.model.Despesa;

import java.util.List;

public class ListarDespesas {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();
//        List<Despesa> despesas = dao.findAll();

//        for (Despesa despesa : despesas) {
//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descricao: " + despesa.getDescricao());
//            System.out.println("Valor: " + despesa.getValor());
//
//            System.out.println("================================================");
//        }

//        Optional<Despesa> despesaOptional = dao.finById(5L);
//        despesaOptional.ifPresent(despesa -> {
//            System.out.println("ID: " + despesa.getId());
//            System.out.println("Descricao: " + despesa.getDescricao());
//            System.out.println("Valor: " + despesa.getValor());
//        });

        List<Despesa> despesas = dao.findByCategoria(Categoria.TRANSPORTE);
        for (Despesa despesa : despesas) {
            System.out.println("ID: " + despesa.getId());
            System.out.println("Valor: " + despesa.getValor());
            System.out.println("Categoria: " + despesa.getCategoria());
            System.out.println("Descricao: " + despesa.getDescricao());

            System.out.println("================================================");
        }
    }
}
