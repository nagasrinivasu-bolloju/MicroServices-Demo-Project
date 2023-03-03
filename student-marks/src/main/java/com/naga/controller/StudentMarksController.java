package com.naga.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.naga.model.StudentMarks;

@RestController
@RequestMapping("/student-marks")
public class StudentMarksController {
	@RequestMapping("/get-marks-{stuName}")
	public StudentMarks getAllMarks(@PathVariable String stuName)
	{
		StudentMarks marks=new StudentMarks();
		marks.setStuName(stuName);
		marks.setEnglish(76);
		marks.setMaths(98);
		marks.setScience(78);
		return marks;
	}
}
