package com.deriklima.springannotationdemo.config;

import com.deriklima.springannotationdemo.UserDAO;
import com.deriklima.springannotationdemo.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.deriklima")
public class SpringConfig {

  @Bean
  public UserDAO userDAO() {
    return new UserDAO();
  }

  @Bean
  public UserService userService() {
    return new UserService(userDAO());
  }

}
