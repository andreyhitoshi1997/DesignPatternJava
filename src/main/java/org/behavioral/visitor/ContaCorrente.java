package org.behavioral.visitor;

public class ContaCorrente implements Conta {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarContaCorrente(this);
    }
}



