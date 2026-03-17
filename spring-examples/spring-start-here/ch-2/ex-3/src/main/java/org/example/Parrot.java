package org.example;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

public class Parrot {
  private String name;

    public void setName(String name) {
        this.name = name;
    }
}
