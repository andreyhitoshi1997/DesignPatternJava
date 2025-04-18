package org.behavioral.strategy;

public class Transacao {
    private EstrategiaTarifa estrategia;

    public void setEstrategia(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public void processar(double valor) {
        double tarifa = estrategia.calcularTarifa(valor);
        System.out.println("Tarifa aplicada: R$" + tarifa);
    }
}