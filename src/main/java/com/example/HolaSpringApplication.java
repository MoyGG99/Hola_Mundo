package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.web.ControladorRest")
@SpringBootApplication
@Slf4j
public class HolaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolaSpringApplication.class, args);
	}



}
