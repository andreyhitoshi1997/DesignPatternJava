package org.behavioral.state;

public interface EstadoConta {
    void sacar(Conta conta, double valor);
    void depositar(Conta conta, double valor);
}