package br.com.demo.funcoes;

import java.util.function.Supplier;

public class SupplierExample {
    public static void supplierExample() {
        Supplier<String> stringSupplier = () -> "Olá, mundo!";
        String result = stringSupplier.get();
        System.out.println("Resultado do Supplier: " + result);
    }
}
