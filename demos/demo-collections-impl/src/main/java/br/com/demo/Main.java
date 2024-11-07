package br.com.demo;

import br.com.demo.list.ListDemo;
import br.com.demo.map.MapDemo;
import br.com.demo.queue.QueueDemo;
import br.com.demo.set.SetDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrando Listas:");
        ListDemo.showExamples();

        System.out.println("\nDemonstrando Mapas:");
        MapDemo.showExamples();

        System.out.println("\nDemonstrando Conjuntos:");
        SetDemo.showExamples();

        System.out.println("\nDemonstrando Filas:");
        QueueDemo.showExamples();
    }
}