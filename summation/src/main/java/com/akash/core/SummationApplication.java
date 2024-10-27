package com.akash.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.akash")
public class SummationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummationApplication.class, args);
	}

}
