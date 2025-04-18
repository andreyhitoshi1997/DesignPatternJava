package org.structural.adapter;

public class Main {
    public static void main(String[] args) {
        // Usando o adapter para integrar sistema legado
        LegacyPaymentService legacy = new LegacyPaymentService();
        PaymentProcessor processor = new LegacyPaymentAdapter(legacy);

        processor.processPayment(250.0);
    }
}
