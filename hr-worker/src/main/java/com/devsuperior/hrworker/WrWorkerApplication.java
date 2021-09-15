package com.devsuperior.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WrWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WrWorkerApplication.class, args);
	}

}
