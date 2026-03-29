package com.proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.dao.CourseDao;
import com.proj.entity.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseDao dao;
	
	public List<Course> getCourses(){
		return dao.getCourses();
	}
	
	public void saveCource(Course course) {
		dao.saveCourse(course);
	}
	
	// Get course by ID
	public Course getCourseById(int id) {
	    return dao.getCourseById(id);
	}
	
	public void updateCourse(Course course) {
	    dao.updateCourse(course);
	}
	
	public void deleteCourse(int id) {
	    dao.deleteCourse(id);
	}
}
