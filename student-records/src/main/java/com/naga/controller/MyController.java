package com.naga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.naga.model.StudentDetails;
import com.naga.model.StudentMarks;
import com.naga.model.StudentRecord;

@RestController
@RequestMapping("/student-records")
public class MyController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/{stuId}")
	public StudentRecord getStudentRecord(@PathVariable int stuId)
	{
//		StudentDetails stuDetails=restTemplate.getForObject("http://localhost:8082/student-details/101",StudentDetails.class);
		// Using WebClient
		StudentDetails stuDetails=webClientBuilder.build()
				.get()
				.uri("http://localhost:8082/student-details/101")
				.retrieve()
				.bodyToMono(StudentDetails.class)
				.block();
		
		//Using RestTemplate
		StudentMarks stuMarks=restTemplate.getForObject("http://student-marks/student-marks/get-marks-"
				+stuDetails.getName(),StudentMarks.class);
		StudentRecord stuRec=new StudentRecord();
		stuRec.setStuId(stuId);
		stuRec.setName(stuDetails.getName());
		stuRec.setPhn(stuDetails.getPhnNum());
		stuRec.setAvgMarks((stuMarks.getEnglish()+stuMarks.getMaths()+stuMarks.getScience())/3);
		return stuRec;
	}
}
