package org.structural.bridge;

public class Radio implements Device {
    private boolean on = false;

    public void turnOn() {
        on = true;
        System.out.println("Rádio ligado");
    }

    public void turnOff() {
        on = false;
        System.out.println("Rádio desligado");
    }

    public boolean isEnabled() {
        return on;
    }
}
