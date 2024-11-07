package br.com.demo.set;

import java.util.HashSet;

public class HashSetExample {
    public static void show() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Item 1");
        hashSet.add("Item 2");
        System.out.println("HashSet: " + hashSet);
    }
}
