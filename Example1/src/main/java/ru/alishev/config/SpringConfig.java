package ru.alishev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alishev.model.*;

@Configuration
public class SpringConfig {
    @Bean
    public int myInt() { return 25; }

    @Bean
    public Music classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public Music rockMusic() {
        return new RockMusic();
    }

    @Bean("jazzMusic")
    public Music myFavoriteMusic() {
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic());
    }
}
