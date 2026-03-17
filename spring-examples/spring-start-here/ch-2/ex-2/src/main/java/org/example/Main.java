package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Parrot p1 = context.getBean( Parrot.class);


    System.out.println( p1 );
    System.out.println("Hello " + p1.getName());
  }
}
