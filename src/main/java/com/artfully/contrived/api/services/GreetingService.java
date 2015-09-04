package com.artfully.contrived.api.services;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.artfully.contrived.api.model.Greeting;

@Service
public class GreetingService {
  
  @Inject
  private Greeting greeting;

  public String greet(String name) {
    return greeting.getGreeting() + name;
  }

}
