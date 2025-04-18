package org.behavioral.visitor;

public class ContaPoupanca implements Conta {
    private double saldo;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void aplicarBonus(double valor) {
        saldo += valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarContaPoupanca(this);
    }
}