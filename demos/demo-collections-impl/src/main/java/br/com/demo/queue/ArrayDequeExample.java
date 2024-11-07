package br.com.demo.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void show() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Element X");
        deque.add("Element Y");
        System.out.println("ArrayDeque: " + deque);
    }
}
