package org.behavioral.templateMethod;

public abstract class ProcessadorPagamento {
    public final void processar(double valor) {
        validar(valor);
        debitar(valor);
        enviarNotificacao();
        registrarLog();
    }

    protected abstract void validar(double valor);
    protected abstract void debitar(double valor);

    protected void enviarNotificacao() {
        System.out.println("Notificação enviada ao cliente.");
    }

    protected void registrarLog() {
        System.out.println("Pagamento registrado no sistema.");
    }
}

