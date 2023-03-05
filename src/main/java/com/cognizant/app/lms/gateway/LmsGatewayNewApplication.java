package com.cognizant.app.lms.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LmsGatewayNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsGatewayNewApplication.class, args);
		System.out.println("LMS Gateway Service Started");
	}

}
