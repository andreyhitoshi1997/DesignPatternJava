package org.Behavioral.Memento;

import java.util.Stack;

public class PropostaHistory {
    private Stack<PropostaMemento> historico = new Stack<>();

    public void salvar(PropostaMemento memento) {
        historico.push(memento);
    }

    public PropostaMemento desfazer() {
        if (!historico.isEmpty()) {
            return historico.pop();
        }
        return null;
    }
}
