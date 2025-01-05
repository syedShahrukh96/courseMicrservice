package com.micro.pro.Project.service;

import com.micro.pro.Project.request.CourseRequest;
import com.micro.pro.Project.response.CourseResponse;

public interface CourseService {

	CourseResponse createCourse(CourseRequest courseRequest);

	CourseResponse getById(long id);

}
