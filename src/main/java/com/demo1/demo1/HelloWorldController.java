package com.demo1.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
//get //post //put //delete
    //GET HTTP METHOD
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World";
    }

}
