package br.com.demo.product;

public class Main {
    public static void main(String[] args) {
        // Exemplo de Supplier
        ProductSupplier productSupplier = new ProductSupplier();
        Product newProduct = productSupplier.createProduct();
        System.out.println("Produto criado: " + newProduct);

        // Exemplo de Consumer
        ProductConsumer productConsumer = new ProductConsumer();
        productConsumer.displayProductInfo(newProduct);

        // Exemplo de Function
        ProductFunction productFunction = new ProductFunction();
        double discountedPrice = productFunction.applyDiscount(newProduct.getPrice(), 10);
        System.out.println("Preço com desconto: " + discountedPrice);

        // Usando ProductService para gerenciar produtos
        ProductService productService = new ProductService();
        productService.addProduct(newProduct);
        productService.addProduct(productSupplier.createProduct());
        productService.displayAllProducts();
    }

}
