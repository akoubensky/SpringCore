package ru.alishev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.alishev.model.ClassicalMusic;
import ru.alishev.model.JazzMusic;
import ru.alishev.model.Music;
import ru.alishev.model.RockMusic;

@Configuration
@ComponentScan("ru.alishev")
public class SpringConfig {
    @Bean
    public int myInt() { return 10; }

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
}
