package org.Behavioral.observer;

public class SistemaAntifraude implements Observador {
    public void notificar(String mensagem) {
        System.out.println("[Antifraude] Avaliando evento: " + mensagem);
    }
}
