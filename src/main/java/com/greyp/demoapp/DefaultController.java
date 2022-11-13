package com.greyp.demoapp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

  @GetMapping("/")
  public ResponseEntity<String> showHelloWorld() {
    return ResponseEntity.ok("Hello world!");
  }

}
