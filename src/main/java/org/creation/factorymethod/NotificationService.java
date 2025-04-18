package org.creation.factorymethod;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory;

        // Suponha que pegamos esse tipo de forma dinâmica (ex: config, usuário, etc)
        String tipo = "SMS";

        if ("EMAIL".equalsIgnoreCase(tipo)) {
            factory = new EmailNotificationFactory();
        } else {
            factory = new SMSNotificationFactory();
        }

        Notification notificacao = factory.createNotification();
        notificacao.send("Sua compra foi aprovada!");
    }
}

