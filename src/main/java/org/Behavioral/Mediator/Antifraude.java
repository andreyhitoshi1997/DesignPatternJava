package org.Behavioral.Mediator;

public class Antifraude extends Colaborador {
    public Antifraude(MediadorCredito mediador) {
        super(mediador);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Antifraude] recebeu: " + mensagem);
    }
}