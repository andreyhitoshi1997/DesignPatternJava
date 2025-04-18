package org.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Transacao t = new Transacao();

        t.setEstrategia(new TarifaPix());
        t.processar(1000); // Tarifa: R$0

        t.setEstrategia(new TarifaBoleto());
        t.processar(1000); // Tarifa: R$3.5

        t.setEstrategia(new TarifaTed());
        t.processar(1000); // Tarifa: R$15.0
    }
}

