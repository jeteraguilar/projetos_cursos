package br.com.demo.product;

import java.util.function.Consumer;

public class ProductConsumer {
    private Consumer<Product> productConsumer = product ->
            System.out.println("Nome: " + product.getName() + ", Preço: " + product.getPrice());

    public void displayProductInfo(Product product) {
        productConsumer.accept(product);
    }
}
