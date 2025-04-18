package org.structural.Facade;

public class SoundSystem {
    public void on() {
        System.out.println("Som ligado.");
    }
    public void off() {
        System.out.println("Som desligado.");
    }
    public void setVolume(int level) {
        System.out.println("Volume ajustado para: " + level);
    }
}