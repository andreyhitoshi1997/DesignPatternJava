package org.Behavioral.state;

public class ContaAtiva implements EstadoConta {
    @Override
    public void sacar(Conta conta, double valor) {
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(Conta conta, double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado.");
    }
}

