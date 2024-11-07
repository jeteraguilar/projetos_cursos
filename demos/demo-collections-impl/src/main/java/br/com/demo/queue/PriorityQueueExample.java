package br.com.demo.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void show() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(1);
        System.out.println("PriorityQueue: " + priorityQueue);
    }
}
