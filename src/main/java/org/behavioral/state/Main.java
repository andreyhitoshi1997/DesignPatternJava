package org.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Saldo atual: R$" + conta.getSaldo());

        // Bloqueando a conta
        conta.setEstado(new ContaBloqueada());

        conta.depositar(100);
        conta.sacar(50);
    }
}
