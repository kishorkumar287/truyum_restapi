package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cts.truyum.controller.MenuItemController;

@SpringBootApplication
@EnableJpaRepositories("com")
@EntityScan("com")
@ComponentScan("com")
@EnableEurekaClient
public class TruyumApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(TruyumApplication.class, args);
	}

}
