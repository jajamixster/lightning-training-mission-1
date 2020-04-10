package com.mission1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

//mark class as Spring MVC REST Controller - this one combine the @Controller and @ResponseBody together
@RestController

//set api path /api for HelloWorldController
@RequestMapping("/api")
public class HelloWorldController {
    //set api path /hello-world for getHello()
    @RequestMapping("/hello-world")
    // HTTP GET Mapping
    @GetMapping
    public String getHello() {
        return "Hello World! What am I doing here :3 - This one is for GET endpoint";
    }

    // HTTP POST Mapping
    /* below are code for POST mapping
    //set api path /hello-word for postHello()
    @RequestMapping("/hello-world")
    //HTTP POST Mapping
    @PostMapping
    public String postHello() {
        return "Hello World! What am I doing here :3 - This one is for POST endpoint";
    }*/
}
