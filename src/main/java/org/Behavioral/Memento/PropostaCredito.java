package org.Behavioral.Memento;

public class PropostaCredito {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
        System.out.println("Estado atual da proposta: " + this.estado);
    }

    public String getEstado() {
        return estado;
    }

    public PropostaMemento salvar() {
        return new PropostaMemento(estado);
    }

    public void restaurar(PropostaMemento memento) {
        this.estado = memento.getEstado();
        System.out.println("Estado restaurado da proposta: " + this.estado);
    }
}

