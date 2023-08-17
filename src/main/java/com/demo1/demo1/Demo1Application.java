package com.demo1.demo1;

import com.demo1.demo1.sub1.StringClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= SpringApplication.run(Demo1Application.class, args);
		StringClass component=applicationContext.getBean(StringClass.class);
		//System.out.println("Hello World");
		System.out.println(component.getHelloWorld());
	}

}
