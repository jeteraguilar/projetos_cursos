package br.com.demo.model;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    private Set<String> set;

    public SetExample() {
        set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Dog");  // Duplicates are ignored
    }

    public Set<String> getSet() {
        return set;
    }
}
