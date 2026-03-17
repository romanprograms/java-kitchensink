package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Parrot p1 = context.getBean("parrot1", Parrot.class);
    Parrot p2 = context.getBean("parrot2", Parrot.class);
    Parrot p3 = context.getBean("parrot3", Parrot.class);
    Parrot p4 = context.getBean("Joji", Parrot.class);

    String k = context.getBean("name", String.class);
    Integer i = context.getBean("ten", Integer.class);

    System.out.println("Hello " + p1.getName());
    System.out.println("Hello " + p2.getName());
    System.out.println("Hello " + p3.getName());
    System.out.println("Hello " + p4.getName());

    System.out.println("String " + k);
    System.out.println("Integer " + i.toString());
  }
}
