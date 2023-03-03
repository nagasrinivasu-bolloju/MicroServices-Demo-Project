package com.naga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 * spring microservices example project:
 * microService-1:student-details(8082)
 * microService-2:student-marks(8081)
 * microservice-3:student-records(dependent on above two)(8083)
 * Eureka server:(8761)(discovery service)
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		System.out.println("Starting Eureka Server!!!");
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}
