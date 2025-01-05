package com.micro.pro.Project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.pro.Project.entity.Course;
import com.micro.pro.Project.repository.CourseRepository;
import com.micro.pro.Project.request.CourseRequest;
import com.micro.pro.Project.response.CourseResponse;

@Service
public class CourseServiceImp implements CourseService{

	
	Logger logger = LoggerFactory.getLogger(CourseServiceImp.class);
	
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@Override
	public CourseResponse createCourse(CourseRequest courseRequest) {	
		
		Course course = new Course();
		course.setCourseName(courseRequest.getCourseName());
		course.setCourseFees(courseRequest.getCourseFees());
		
		courseRepository.save(course);
		
		return new CourseResponse(course);
	}


	@Override
	public CourseResponse getById(long id) {
		
		logger.info("In course getById:  "+id);
		
		Course course = courseRepository.findById(id).orElse(new Course());
		
		return new CourseResponse(course);
	}

}
