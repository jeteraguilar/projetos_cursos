package br.com.demo.model;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    private Queue<String> queue;

    public QueueExample() {
        queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
    }

    public Queue<String> getQueue() {
        return queue;
    }
}
