package org.behavioral.strategy;

public class TarifaTed implements EstrategiaTarifa {
    @Override
    public double calcularTarifa(double valor) {
        return valor * 0.015; // 1.5%
    }
}