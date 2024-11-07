package br.com.demo.collections.manipulation;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void setOperations() {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Tentativa de adicionar duplicado

        System.out.println("Conjunto de cores (sem duplicatas): " + colors);

        // Remover um elemento
        colors.remove("Green");
        System.out.println("Cores após remoção: " + colors);
    }
}
