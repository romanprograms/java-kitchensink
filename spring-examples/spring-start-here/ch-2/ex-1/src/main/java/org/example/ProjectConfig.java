package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean
    Parrot parrot3() {
        Parrot parrot = new Parrot();
        parrot.setName("Riki");
        return parrot;
    }

    // Alternative ways to name the bean, but the method name is more common and recommended.
    // @Bean(name = "miki")
    // @Bean(value = "miki")
    // @Bean("miki")”
    @Bean(name = "Joji")
    Parrot parrot4() {
        Parrot parrot = new Parrot();
        parrot.setName("Roman");
        return parrot;
    }

    @Bean String name() {
        return "Koko";
    }
    @Bean Integer ten() {
        return 10;
    }
}
