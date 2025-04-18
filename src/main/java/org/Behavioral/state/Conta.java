package org.Behavioral.state;

public class Conta {
    private EstadoConta estado;
    private double saldo;

    public Conta() {
        this.estado = new ContaAtiva(); // estado inicial
        this.saldo = 0;
    }

    public void setEstado(EstadoConta estado) {
        this.estado = estado;
    }

    public EstadoConta getEstado() {
        return estado;
    }

    public void sacar(double valor) {
        estado.sacar(this, valor);
    }

    public void depositar(double valor) {
        estado.depositar(this, valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

