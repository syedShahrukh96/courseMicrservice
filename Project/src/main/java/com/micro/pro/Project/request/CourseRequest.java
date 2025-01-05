package com.micro.pro.Project.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequest {
	
	private String courseName;
	private Double courseFees;
	
}
