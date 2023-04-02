package com.robbit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.robbit"})
@EntityScan(basePackages = {"com.robbit.entities"})
@EnableJpaRepositories(basePackages = {"com.robbit.repos"})
public class RobbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobbitApplication.class, args);
	}

}
