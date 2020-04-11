package com.deriklima.springannotationdemo;

import java.security.SecureRandom;

public class UserDAO {

  private SecureRandom secureRandom;

  public UserDAO() {
    secureRandom = new SecureRandom();
  }

  public Integer save(String user) {
    return secureRandom.ints(1, 100).findFirst().getAsInt();
  }

}