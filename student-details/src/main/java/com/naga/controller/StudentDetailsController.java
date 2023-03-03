package com.naga.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naga.model.StudentDetails;

@RestController
@RequestMapping("/student-details")
public class StudentDetailsController {
	@RequestMapping("/{stuId}")
	public StudentDetails getStudentDetails(@PathVariable("stuId") int stuId)
	{
		StudentDetails stuDetails=new StudentDetails();
		stuDetails.setStuId(stuId);
		stuDetails.setName("naga");
		stuDetails.setPhnNum("9618916557");
		return stuDetails;
	}
}
