package com.application.modul3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // It is a combination of three annotations @EnableAutoConfiguration,
						// @ComponentScan, and @Configuration.
//We use this annotation to mark the main class of a Spring Boot application
public class Modul3Application {

	public static void main(String[] args) {
		SpringApplication.run(Modul3Application.class, args);
	}

}
