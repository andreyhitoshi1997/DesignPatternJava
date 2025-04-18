package org.Behavioral.strategy;

public class TarifaPix implements EstrategiaTarifa {
    @Override
    public double calcularTarifa(double valor) {
        return 0; // Pix é gratuito
    }
}
