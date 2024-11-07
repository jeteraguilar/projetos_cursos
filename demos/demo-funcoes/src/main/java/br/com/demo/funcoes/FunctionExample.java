package br.com.demo.funcoes;

import java.util.function.Function;

public class FunctionExample {
    public static void functionExample() {
        Function<Integer, String> intToString = i -> "Número: " + i;
        String result = intToString.apply(42);
        System.out.println("Resultado da Function: " + result);
    }
}
