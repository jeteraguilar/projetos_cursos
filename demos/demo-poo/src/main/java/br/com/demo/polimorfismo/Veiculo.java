package br.com.demo.polimorfismo;

public class Veiculo {
    protected String modelo;
    protected String cor;
    protected int ano;

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano);
    }

    public void mostrarInfo(boolean debug) {
        if (debug) {
            System.out.println("Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano);
        }
    }
}
