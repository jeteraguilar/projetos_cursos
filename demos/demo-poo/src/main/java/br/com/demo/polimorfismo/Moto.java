package br.com.demo.polimorfismo;

public class Moto extends Veiculo {
    private boolean temSidecar;

    public Moto(String modelo, String cor, int ano, boolean temSidecar) {
        super(modelo, cor, ano);
        this.temSidecar = temSidecar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tem Sidecar: " + (temSidecar ? "Sim" : "Não"));
    }
}
