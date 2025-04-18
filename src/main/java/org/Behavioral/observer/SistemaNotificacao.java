package org.Behavioral.observer;

public class SistemaNotificacao implements Observador {
    public void notificar(String mensagem) {
        System.out.println("[Notificação] Enviada: " + mensagem);
    }
}
