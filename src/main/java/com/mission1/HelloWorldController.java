package com.mission1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/hello-world")
//mark class as Spring MVC REST Controller - this one combine the @Controller and @ResponseBody together
@RestController
public class HelloWorldController {
    // HTTP GET Mapping
    @GetMapping
    public String getHello() {
        return "Hello World! What am I doing here :3 - This one is for GET endpoint";
    }
    // HTTP POST Mapping
    @PostMapping
    public String postHelllo() {
        return "Hello World! What am I doing here :3 - This one is for POST endpoint";
    }
}
