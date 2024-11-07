package br.com.demo.model;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    private Map<Integer, String> map;

    public MapExample() {
        map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
