package br.com.demo.abstracao;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}
