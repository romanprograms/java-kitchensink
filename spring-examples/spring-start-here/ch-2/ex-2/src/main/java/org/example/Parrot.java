package org.example;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Parrot {
  private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init () {
        System.out.println("Initializing Parrot bean");
        this.name = "Polly";
    }
}
