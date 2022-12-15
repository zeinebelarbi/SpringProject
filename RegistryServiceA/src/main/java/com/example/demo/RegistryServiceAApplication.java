package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceAApplication.class, args);
	}

}
