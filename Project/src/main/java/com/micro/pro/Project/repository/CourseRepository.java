package com.micro.pro.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.pro.Project.entity.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
	

}
