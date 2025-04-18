package org.Behavioral.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = List.of(
                new ContaCorrente(1000),
                new ContaPoupanca(2000)
        );

        Visitor taxaVisitor = new TaxaVisitor();

        for (Conta c : contas) {
            c.aceitar(taxaVisitor);
        }
    }
}

