package br.com.demo.collections.manipulation;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void mapOperations() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        System.out.println("Mapa de idades: " + ages);

        // Acessar um valor pelo identificador (chave)
        Integer ageOfAlice = ages.get("Alice");
        System.out.println("Idade de Alice: " + ageOfAlice);

        // Remover um elemento
        ages.remove("Bob");
        System.out.println("Mapa de idades após remoção: " + ages);
    }
}
