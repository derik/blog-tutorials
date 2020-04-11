package com.deriklima.springannotationdemo;

import com.deriklima.springannotationdemo.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

  public static void main(String[] args) {

    try (AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(SpringConfig.class)) {

      UserService userService = context.getBean("userService", UserService.class);

      System.out.println(userService.getCurrentUser());
      System.out.println(userService.save("Test User"));
    }

  }
}
