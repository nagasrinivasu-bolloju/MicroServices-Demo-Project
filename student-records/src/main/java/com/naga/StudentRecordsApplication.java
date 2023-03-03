package com.naga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;



/*
 * spring microservices example project:
 * microService-1:student-details(8082)
 * microService-2:student-marks(8081)
 * microservice-3:student-records(dependent on above two)(8083)
 * Eureka server:(8761)(discovery service)
 */

@SpringBootApplication
public class StudentRecordsApplication {

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
    
    @Bean
    WebClient.Builder getWebClientBuilder()
    {
    	return WebClient.builder();
    }
    
	public static void main(String[] args) {
		SpringApplication.run(StudentRecordsApplication.class, args);
	}

}
