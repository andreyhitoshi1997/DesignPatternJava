package org.behavioral.strategy;

public class TarifaBoleto implements EstrategiaTarifa {
    @Override
    public double calcularTarifa(double valor) {
        return 3.5; // tarifa fixa
    }
}
