package org.behavioral.state;

public class ContaBloqueada implements EstadoConta {
    @Override
    public void sacar(Conta conta, double valor) {
        System.out.println("Conta bloqueada. Saque não permitido.");
    }

    @Override
    public void depositar(Conta conta, double valor) {
        System.out.println("Conta bloqueada. Depósito não permitido.");
    }
}

