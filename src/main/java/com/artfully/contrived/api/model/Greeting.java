package com.artfully.contrived.api.model;

import org.springframework.stereotype.Repository;

@Repository
public class Greeting {

  private String greeting = "Hallo";
  /**
   * @return the greeting
   */
  public String getGreeting() {
    return greeting;
  }
}
