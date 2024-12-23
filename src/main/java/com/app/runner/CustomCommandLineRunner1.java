package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class CustomCommandLineRunner1 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From run method in CustomCommandLineRunner1 class.");
	}

}
