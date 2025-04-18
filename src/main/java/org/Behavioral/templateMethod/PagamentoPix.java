package org.Behavioral.templateMethod;

public class PagamentoPix extends ProcessadorPagamento {
    @Override
    protected void validar(double valor) {
        System.out.println("Validando chave Pix e saldo disponível...");
    }

    @Override
    protected void debitar(double valor) {
        System.out.println("Transferência Pix no valor de R$" + valor + " realizada.");
    }
}
