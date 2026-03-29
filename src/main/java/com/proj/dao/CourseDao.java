package com.proj.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.proj.entity.Course;

@Repository
public class CourseDao {
	
	private static List<Course> courseList = new ArrayList<>();
	
	static {
		Course c = new Course();
		c.setId(1);
		c.setName("Java");
		c.setInstructor("Dinesh");
		
		courseList.add(c);
	}
	
	
	public List<Course> getCourses() {
		return courseList;
	}
	
	public void saveCourse(Course c) {
		courseList.add(c);
	}
	
	public Course getCourseById(int id) {
		return courseList.stream()
				.filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
	}
	
	public void updateCourse(Course updated) {

	    for (Course c : courseList) {
	        if (c.getId() == updated.getId()) {
	            c.setName(updated.getName());
	            c.setInstructor(updated.getInstructor());
	            break;
	        }
	    }
	}
	
	public void deleteCourse(int id) {

	    courseList.removeIf(c -> c.getId() == id);
	}
	
}
