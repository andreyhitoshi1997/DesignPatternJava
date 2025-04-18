package org.creation.singleton;

public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("Primeira mensagem");
        log2.log("Segunda mensagem");

        System.out.println("Mesma instância? " + (log1 == log2)); // true
    }
}