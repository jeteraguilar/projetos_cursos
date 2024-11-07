package br.com.demo.map;

import java.util.HashMap;

public class HashMapExample {
    public static void show() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 10);
        hashMap.put("Key2", 20);
        System.out.println("HashMap: " + hashMap);
    }
}
