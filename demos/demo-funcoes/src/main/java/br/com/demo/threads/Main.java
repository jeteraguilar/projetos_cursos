package br.com.demo.threads;

public class Main {

    public static void main(String[] args) {
        // Criação de duas instâncias de MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Criação de duas threads
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");

        // Início das threads
        thread1.start();
        thread2.start();

        // Espera as threads terminarem
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread principal foi interrompida.");
        }

        System.out.println("Threads finalizadas.");
    }
}
