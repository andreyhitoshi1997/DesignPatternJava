package org.Behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento pagamentoPix = new PagamentoPix();
        pagamentoPix.processar(250.00);

        System.out.println("-----");

        ProcessadorPagamento pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.processar(390.50);
    }
}

