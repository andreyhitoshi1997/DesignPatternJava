package org.behavioral.visitor;

public class TaxaVisitor implements Visitor {
    @Override
    public void visitarContaCorrente(ContaCorrente cc) {
        double taxa = cc.getSaldo() * 0.01;
        cc.debitar(taxa);
        System.out.println("Taxa de R$" + taxa + " aplicada à conta corrente.");
    }

    @Override
    public void visitarContaPoupanca(ContaPoupanca cp) {
        double bonus = cp.getSaldo() * 0.005;
        cp.aplicarBonus(bonus);
        System.out.println("Bônus de R$" + bonus + " aplicado à conta poupança.");
    }
}

