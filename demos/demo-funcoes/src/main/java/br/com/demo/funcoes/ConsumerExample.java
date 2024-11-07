package br.com.demo.funcoes;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void consumerExample() {
        Consumer<String> stringConsumer = s -> System.out.println("Consumindo: " + s);
        stringConsumer.accept("Exemplo de Consumer");
    }
}
