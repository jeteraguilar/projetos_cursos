package br.com.demo.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void show() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Item 3");
        linkedHashSet.add("Item 4");
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
