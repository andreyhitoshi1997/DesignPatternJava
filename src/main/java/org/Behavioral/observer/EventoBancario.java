package org.Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventoBancario {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void novoEvento(String mensagem) {
        System.out.println("Evento gerado: " + mensagem);
        for (Observador o : observadores) {
            o.notificar(mensagem);
        }
    }
}

