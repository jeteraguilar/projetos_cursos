package br.com.demo.product;

import java.util.function.Supplier;

public class ProductSupplier {
    private Supplier<Product> productSupplier = () -> new Product("Produto Exemplo", 100.0);

    public Product createProduct() {
        return productSupplier.get();
    }
}
