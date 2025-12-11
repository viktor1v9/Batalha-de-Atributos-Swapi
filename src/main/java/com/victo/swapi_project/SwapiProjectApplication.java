package com.victo.swapi_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SwapiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapiProjectApplication.class, args);
	}

}
