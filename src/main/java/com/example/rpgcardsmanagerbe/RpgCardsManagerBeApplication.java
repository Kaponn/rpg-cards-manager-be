package com.example.rpgcardsmanagerbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.rpgcardsmanagerbe.repositories")
public class RpgCardsManagerBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgCardsManagerBeApplication.class, args);
	}

}
