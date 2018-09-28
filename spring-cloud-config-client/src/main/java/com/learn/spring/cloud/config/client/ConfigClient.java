package com.learn.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ConfigClient {

  @Value("${user.role}")
  private String role;

  @Value("${user.password}")
  private String password;

  public static void main(String[] args) {
    SpringApplication.run(ConfigClient.class, args);
  }

  @GetMapping("/")
  public String index() {
    return "you can access http://localhost:8080/{name}";
  }

  @RequestMapping(value = "/{username}", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
  public String whoami(@PathVariable("username") String username) {
    return String.format("Hello %s! You are a(n) %s and your password is '%s'.\n", username, role, password);
  }
}
