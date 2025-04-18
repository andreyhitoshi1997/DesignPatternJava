package org.behavioral.templateMethod;

public class PagamentoBoleto extends ProcessadorPagamento {
    @Override
    protected void validar(double valor) {
        System.out.println("Validando código de barras e vencimento do boleto...");
    }

    @Override
    protected void debitar(double valor) {
        System.out.println("Pagamento de boleto no valor de R$" + valor + " realizado.");
    }
}

