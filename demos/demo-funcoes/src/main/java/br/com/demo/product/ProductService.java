package br.com.demo.product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Produto adicionado: " + product);
    }

    public void displayAllProducts() {
        System.out.println("Lista de Produtos:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
