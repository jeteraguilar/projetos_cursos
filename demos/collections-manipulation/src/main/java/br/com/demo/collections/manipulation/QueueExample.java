package br.com.demo.collections.manipulation;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void queueOperations() {
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");

        System.out.println("Fila de clientes: " + customerQueue);

        // Verificar o primeiro da fila sem remover
        String firstCustomer = customerQueue.peek();
        System.out.println("Primeiro cliente na fila (peek): " + firstCustomer);

        // Remover e atender o primeiro da fila
        String servedCustomer = customerQueue.poll();
        System.out.println("Cliente atendido (poll): " + servedCustomer);

        // Fila após atendimento
        System.out.println("Fila de clientes após atendimento: " + customerQueue);
    }
}
