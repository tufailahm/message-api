package org.example.messageapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping
    public String welcome(){
        return "Welcome OFSS, Good morning";
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello OFSS";
    }
    @GetMapping("/bye")
    public String bye(){
        return "Bye OFSS";
    }
}
