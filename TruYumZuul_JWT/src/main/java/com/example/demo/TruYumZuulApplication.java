package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan("com")
public class TruYumZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruYumZuulApplication.class, args);
	}

}
