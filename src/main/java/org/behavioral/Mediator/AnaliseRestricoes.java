package org.behavioral.Mediator;

public class AnaliseRestricoes extends Colaborador {
    public AnaliseRestricoes(MediadorCredito mediador) {
        super(mediador);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("[Restrição] recebeu: " + mensagem);
    }
}