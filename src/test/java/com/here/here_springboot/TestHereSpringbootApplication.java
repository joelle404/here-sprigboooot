package com.here.here_springboot;

import org.springframework.boot.SpringApplication;

public class TestHereSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.from(HereSpringbootApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
