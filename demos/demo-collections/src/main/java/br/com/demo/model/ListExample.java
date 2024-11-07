package br.com.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    private List<String> list;

    public ListExample() {
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // Duplicates allowed
    }

    public List<String> getList() {
        return list;
    }
}
