package com.br.cargoapp.cargoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class CargoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CargoappApplication.class, args);
	}

}
