package ru.alishev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.alishev.config.SpringConfig;
import ru.alishev.model.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

        MusicPlayer player = context.getBean(MusicPlayer.class);
        player.playMusic();
        MusicPlayer player1 = context.getBean(MusicPlayer.class);
        System.out.println(player == player1);
    }
}
