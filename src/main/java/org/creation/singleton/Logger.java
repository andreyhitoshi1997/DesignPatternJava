package org.creation.singleton;

public class Logger {
    private static Logger instance;

    // Construtor privado impede instanciamento externo
    private Logger() {}

    // Método público de acesso à instância
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}

