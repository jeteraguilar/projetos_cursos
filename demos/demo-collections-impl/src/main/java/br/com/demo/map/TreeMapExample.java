package br.com.demo.map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void show() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Key1", 30);
        treeMap.put("Key2", 40);
        System.out.println("TreeMap: " + treeMap);
    }
}
