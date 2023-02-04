package ru.alishev.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final Music music;

    public MusicPlayer(@Qualifier("rockMusic") Music music, int n) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
