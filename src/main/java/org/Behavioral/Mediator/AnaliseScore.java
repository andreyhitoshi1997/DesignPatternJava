package org.Behavioral.Mediator;

public class AnaliseScore extends Colaborador {
    public AnaliseScore(MediadorCredito mediador) {
        super(mediador);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Score] recebeu: " + mensagem);
    }
}
