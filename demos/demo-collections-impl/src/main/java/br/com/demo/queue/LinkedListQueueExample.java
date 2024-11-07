package br.com.demo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void show() {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("LinkedList as Queue: " + queue);
    }
}
