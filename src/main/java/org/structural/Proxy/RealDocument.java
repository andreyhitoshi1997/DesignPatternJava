package org.structural.Proxy;

public class RealDocument implements Document {
    private String fileName;

    public RealDocument(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // simula carregamento pesado
    }

    private void loadFromDisk() {
        System.out.println("Carregando documento: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Exibindo: " + fileName);
    }
}
