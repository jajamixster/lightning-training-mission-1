package com.mission1;

import org.springframework.web.bind.annotation.*;

//mark class as Spring MVC REST Controller - Contain @Controller and @ResponseBody
@RestController
@RequestMapping("/api")
public class HelloWorldController {
    //HTTP GET Mapping
    @GetMapping("/hello-world")
    public String getHello() {
        return "Hello World! What am I doing here :3 - This one is for GET endpoint";
    }
}
