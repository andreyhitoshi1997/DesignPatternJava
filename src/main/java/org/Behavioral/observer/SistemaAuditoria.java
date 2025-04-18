package org.Behavioral.observer;

public class SistemaAuditoria implements Observador {
    public void notificar(String mensagem) {
        System.out.println("[Auditoria] Log registrado: " + mensagem);
    }
}