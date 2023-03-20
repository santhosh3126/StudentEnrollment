package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan("com.eample.demo")
//@EnableJpaRepositories("com.SpringBoot.demo.Repository")
public class SpringBoot11Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot11Application.class, args);
	}

}
