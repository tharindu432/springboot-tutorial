package com.demo1.demo1.sub1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication

//@Component --- we can use one of this two annotation.but Springbootapplication annotation has Componant
public class StringClass {
    public String getHelloWorld() {
        return "Hello World";
    }
}
