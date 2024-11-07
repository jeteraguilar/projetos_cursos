package br.com.demo.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void show() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Key1", 50);
        linkedHashMap.put("Key2", 60);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}
