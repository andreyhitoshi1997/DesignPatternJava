package org.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower(); // TV ligada

        Device radio = new Radio();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.togglePower(); // Rádio ligado
        advancedRemote.mute();        // Dispositivo no mudo
    }
}
