package br.com.demo.heranca;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String modelo, String cor, int ano, int numeroDePortas) {
        super(modelo, cor, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}
