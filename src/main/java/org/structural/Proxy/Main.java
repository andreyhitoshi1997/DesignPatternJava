package org.structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Document doc1 = new DocumentProxy("contrato_confidencial.pdf", true);
        Document doc2 = new DocumentProxy("relatorio_financeiro.pdf", false);

        doc1.display(); // Acesso permitido
        System.out.println("---");
        doc2.display(); // Acesso negado
    }
}

