package rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/foo/bar")
  public String sayHello() {
    return "Hello world !!!";
  }
}
