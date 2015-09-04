package com.artfully.contrived.api.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.artfully.contrived.api.services.GreetingService;

@Configuration
@ComponentScan("com.artfully.contrived.api")
public class SpringConfiguration {

  @Bean
  public GreetingService greetingService() {
    return new GreetingService();
  }

}
