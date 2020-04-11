package com.deriklima.springxmldemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static void main(String[] args) {
    try (ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml")) {

      UserService userService = context.getBean("userService", UserService.class);

      System.out.println(userService.getCurrentUser());
      System.out.println(userService.save("Test User"));
    }
  }

}
