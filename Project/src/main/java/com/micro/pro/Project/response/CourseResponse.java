package com.micro.pro.Project.response;


import com.micro.pro.Project.entity.Course;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private String courseName;
	private Double courseFees;
	
	
	
	
	public CourseResponse(Course course) {
		super();
		this.courseId = course.getCourseId();
		this.courseName = course.getCourseName();
		this.courseFees = course.getCourseFees();
	}
	
	
	
	
}
