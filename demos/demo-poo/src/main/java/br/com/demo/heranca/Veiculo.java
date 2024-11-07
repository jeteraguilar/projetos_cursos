package br.com.demo.heranca;

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
}
