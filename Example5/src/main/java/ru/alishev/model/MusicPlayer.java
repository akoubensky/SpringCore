package ru.alishev.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MusicPlayer {
    @Autowired
    ApplicationContext context;

    private Music music;

    @Value("${player-name}")
    private String name;
    @Value("${player-volume}")
    private int volume;
    @Value("${player-music}")
    private String musicBeanName;

    @PostConstruct
    private void init() {
        music = context.getBean(musicBeanName, Music.class);
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Performing destruction");
    }

    public void playMusic() {
        System.out.format("Player %s is playing %s with %d volume%n", name, music.getSong(), volume);
    }
}
