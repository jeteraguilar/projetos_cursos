package br.com.demo.abstracao;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor * 1.01; // bônus para poupança
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
}
