package org.Behavioral.Mediator;

public abstract class Colaborador {
    protected MediadorCredito mediador;

    public Colaborador(MediadorCredito mediador) {
        this.mediador = mediador;
    }

    public abstract void receber(String mensagem);

    public void enviar(String mensagem) {
        mediador.enviar(mensagem, this);
    }
}

