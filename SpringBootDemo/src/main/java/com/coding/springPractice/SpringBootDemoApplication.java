package com.coding.springPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
		
		Alien al=context.getBean(Alien.class);
		System.out.println(al);
		al.show();
		
 		
	}

}
