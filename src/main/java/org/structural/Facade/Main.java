package org.structural.Facade;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        StreamingService streaming = new StreamingService();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, sound, streaming);

        homeTheater.watchMovie("Matrix");
        System.out.println("-----");
        homeTheater.endMovie();
    }
}
