package com.deriklima.springannotationdemo;

import java.security.SecureRandom;

public class UserService {

  private SecureRandom random;
  private UserDAO userDAO;

  public UserService(UserDAO userDAO) {
    random = new SecureRandom();
    this.userDAO = userDAO;
  }

  public String getCurrentUser() {
    return "User " + random.ints(1, 100).findFirst().getAsInt();
  }

  public Integer save(String user) {
    return userDAO.save(user);
  }

}
