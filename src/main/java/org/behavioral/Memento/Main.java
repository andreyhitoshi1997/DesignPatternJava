package org.behavioral.Memento;

public class Main {
    public static void main(String[] args) {
        PropostaCredito proposta = new PropostaCredito();
        PropostaHistory history = new PropostaHistory();

        proposta.setEstado("Iniciada");
        history.salvar(proposta.salvar());

        proposta.setEstado("Análise de crédito");
        history.salvar(proposta.salvar());

        proposta.setEstado("Aguardando documentação");
        history.salvar(proposta.salvar());

        proposta.setEstado("Cancelada");

        System.out.println("--- Desfazendo etapas ---");
        proposta.restaurar(history.desfazer()); // volta para "Aguardando documentação"
        proposta.restaurar(history.desfazer()); // volta para "Análise de crédito"
    }
}
