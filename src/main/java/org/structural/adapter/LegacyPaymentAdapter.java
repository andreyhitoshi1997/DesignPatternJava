package org.structural.adapter;

public class LegacyPaymentAdapter implements PaymentProcessor {
    private LegacyPaymentService legacyService;

    public LegacyPaymentAdapter(LegacyPaymentService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void processPayment(double amount) {
        legacyService.makePayment(amount); // adapta a chamada
    }
}
