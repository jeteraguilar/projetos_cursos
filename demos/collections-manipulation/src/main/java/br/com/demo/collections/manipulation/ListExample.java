package br.com.demo.collections.manipulation;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void listOperations() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Lista de frutas: " + fruits);

        // Acessar um elemento
        String firstFruit = fruits.get(0);
        System.out.println("Primeira fruta: " + firstFruit);

        // Remover um elemento
        fruits.remove("Banana");
        System.out.println("Lista de frutas após remoção: " + fruits);
    }
}
