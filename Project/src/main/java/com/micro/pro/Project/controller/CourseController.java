package com.micro.pro.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.pro.Project.request.CourseRequest;
import com.micro.pro.Project.response.CourseResponse;
import com.micro.pro.Project.service.CourseService;
import com.micro.pro.Project.service.CourseServiceImp;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/create")
	public CourseResponse createCourse(@RequestBody CourseRequest courseRequest) {
		return courseService.createCourse(courseRequest);
		
	}
	
	@GetMapping("/getById/{id}")
	public CourseResponse getById(@PathVariable long id) {
		return courseService.getById(id);
	}

}
