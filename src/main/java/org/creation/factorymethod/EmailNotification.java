package org.creation.factorymethod;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}
