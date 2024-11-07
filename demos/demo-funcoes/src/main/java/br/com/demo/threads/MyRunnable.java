package br.com.demo.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " - Contagem: " + i);
            try {
                Thread.sleep(1000); // Pausa a thread por 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Thread foi interrompida.");
            }
        }
    }
}
