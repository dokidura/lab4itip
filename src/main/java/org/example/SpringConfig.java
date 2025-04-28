package org.example;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Fridge fridge() {
        return new Fridge("Holodilnik", 100);
    }

    @Bean
    public Dishwasher dishwasher() {
        return new Dishwasher("Posudomoika", 10);
    }

    @Bean
    public Vacuum vacuum() {
        return new Vacuum("Pylesos", 200);
    }

}