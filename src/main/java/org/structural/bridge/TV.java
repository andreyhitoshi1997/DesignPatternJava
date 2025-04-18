package org.structural.bridge;

public class TV implements Device {
    private boolean on = false;

    public void turnOn() {
        on = true;
        System.out.println("TV ligada");
    }

    public void turnOff() {
        on = false;
        System.out.println("TV desligada");
    }

    public boolean isEnabled() {
        return on;
    }
}


