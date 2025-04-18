package org.structural.adapter;

public class LegacyPaymentService {
    public void makePayment(double value) {
        System.out.println("Pagamento realizado via sistema legado: R$ " + value);
    }
}

