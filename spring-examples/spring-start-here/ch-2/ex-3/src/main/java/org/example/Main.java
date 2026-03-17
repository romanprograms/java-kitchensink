package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var x = new Parrot();
    x.setName("Koko");

    Supplier<Parrot> parrotSupplier = () -> x;

    context.registerBean("parrot", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true));

    Parrot p = context.getBean(Parrot.class);


    System.out.println( p );
  }
}
