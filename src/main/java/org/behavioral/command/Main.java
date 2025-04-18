package org.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Light sala = new Light();

        Command ligar = new TurnOnCommand(sala);
        Command desligar = new TurnOffCommand(sala);

        RemoteControl controle = new RemoteControl();

        controle.setCommand(ligar);
        controle.pressButton(); // Luz acesa.

        controle.setCommand(desligar);
        controle.pressButton(); // Luz apagada.
    }
}

