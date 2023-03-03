package com.naga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * spring microservices example project:
 * microService-1:student-details(8082)
 * microService-2:student-marks(8081)
 * microservice-3:student-records(dependent on above two)(8083)
 * Eureka server:(8761)(discovery service)
 */
@SpringBootApplication
public class StudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
	}

}
