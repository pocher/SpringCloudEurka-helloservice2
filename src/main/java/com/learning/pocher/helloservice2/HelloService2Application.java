package com.learning.pocher.helloservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloService2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloService2Application.class, args);
	}
}
