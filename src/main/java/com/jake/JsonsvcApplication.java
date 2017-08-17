package com.jake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonsvcApplication {

	public static void main(String[] args) {

		SpringApplication.run(JsonsvcApplication.class, args);
		System.out.println("Changed this in branch-1");
	}
}

