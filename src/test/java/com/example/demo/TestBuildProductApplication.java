package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestBuildProductApplication {

	public static void main(String[] args) {
		SpringApplication.from(BuildProductApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
