package br.com.demo.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fusca", "Azul", 1980);
        veiculo.mostrarInfo();

        Carro carro = new Carro("Civic", "Preto", 2020, 4);
        carro.mostrarInfo();

        Moto moto = new Moto("Harley", "Vermelha", 2021, true);
        moto.mostrarInfo();

        // Demonstração de polimorfismo
        Veiculo meuVeiculo = carro; // Um carro é um veículo
        meuVeiculo.mostrarInfo(); // Chama o método da classe Carro
    }
}