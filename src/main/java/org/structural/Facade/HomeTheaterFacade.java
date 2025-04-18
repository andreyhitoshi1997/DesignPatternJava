package org.structural.Facade;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private StreamingService streaming;

    public HomeTheaterFacade(TV tv, SoundSystem sound, StreamingService streaming) {
        this.tv = tv;
        this.sound = sound;
        this.streaming = streaming;
    }

    public void watchMovie(String title) {
        System.out.println("Preparando para assistir ao filme...");
        tv.on();
        sound.on();
        sound.setVolume(15);
        streaming.playMovie(title);
    }

    public void endMovie() {
        System.out.println("Encerrando sessão...");
        streaming.stop();
        sound.off();
        tv.off();
    }
}
