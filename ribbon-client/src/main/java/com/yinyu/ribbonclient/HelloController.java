package com.yinyu.ribbonclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/hi")
  public String hi() {
    return restTemplate.getForObject("http://SERVER/backend", String.class);
  }
}