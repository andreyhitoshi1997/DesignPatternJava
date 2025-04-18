package org.structural.Facade;

public class StreamingService {
    public void playMovie(String title) {
        System.out.println("Reproduzindo filme: " + title);
    }
    public void stop() {
        System.out.println("Filme parado.");
    }
}
