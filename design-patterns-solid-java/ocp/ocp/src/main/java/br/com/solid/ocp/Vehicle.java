package br.com.solid.ocp;

import java.sql.SQLOutput;

public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color,String year, double engine, int seats){
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car(){
        System.out.println("Criando um carro: "+ color + " " + year + " " + engine + "com " + seats + " assentos");
        startVehicle();
    }

    void motorcyle(){
        System.out.println("Criando uma moto: " + year + " " + engine + "  cilindradas");
        startVehicle();
    }

    void startVehicle(){
        System.out.println("Ligando os motores");
    }

}
