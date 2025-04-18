package org.creation.prototype;

public class Main {
    public static void main(String[] args) {
        Document original = new Document("Contrato Padrão", "Conteúdo legal padrão...");

        DocumentPrototype copia1 = original.clone();
        ((Document)copia1).setTitle("Contrato para Cliente A");

        DocumentPrototype copia2 = original.clone();
        ((Document)copia2).setTitle("Contrato para Cliente B");
        ((Document)copia2).setContent("Conteúdo modificado para cliente B...");

        original.print();
        ((Document)copia1).print();
        ((Document)copia2).print();
    }
}
