package org.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        EventoBancario evento = new EventoBancario();

        Observador notificacao = new SistemaNotificacao();
        Observador antifraude = new SistemaAntifraude();
        Observador auditoria = new SistemaAuditoria();

        evento.adicionarObservador(notificacao);
        evento.adicionarObservador(antifraude);
        evento.adicionarObservador(auditoria);

        evento.novoEvento("PIX recebido de R$ 200,00");
    }
}
