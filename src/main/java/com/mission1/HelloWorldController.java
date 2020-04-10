package com.mission1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/hello-world")
//mark class as Spring MVC Controller
@RestController
public class HelloWorldController {
    // HTTP GET Mapping
    @GetMapping
    @ResponseBody
    public String getHello() {
        return "Hello World! What am I doing here :3 - This one is for GET endpoint";
    }
    // HTTP POST Mapping
    @PostMapping
    @ResponseBody
    public String postHelllo() {
        return "Hello World! What am I doing here :3 - This one is for POST endpoint";
    }
}
