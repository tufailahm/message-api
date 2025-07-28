package org.example.messageapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping
    public String welcome(){
        return "Welcome OFSS, Good morning";
    }
}
