package com.example.demo;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
         int numero = 0;

        System.out.println("Esse número é ");
        numero = sc.nextInt();
         
        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}