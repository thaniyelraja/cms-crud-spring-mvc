package com.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proj.entity.Course;
import com.proj.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	CourseService service;
	
	
	@GetMapping("/")
	public String home(Model model) {
		List<Course> list = service.getCourses();
		model.addAttribute("courses", list);
		return "courses";
	}
	
	
	 @GetMapping("/addCourse")
	    public String addPage(Model model) {
		 	model.addAttribute("course", new Course());
	        return "addCourse"; 
	    }
	 
	 @GetMapping("/edit")
	 public String editCourse(@RequestParam("id") int id, Model model) {

	     Course course = service.getCourseById(id);

	     model.addAttribute("course", course);

	     return "addCourse"; // reuse same page
	 }
	 
	 @GetMapping("/delete")
	 public String deleteCourse(@RequestParam int id) {

	     service.deleteCourse(id);

	     return "redirect:/";
	 }
	 
	 @PostMapping("/save")
	 public String saveCourse(@ModelAttribute Course course) {
		 int id = service.getCourses().size()+1;
		 course.setId(id);
		 service.saveCource(course);
		 return "redirect:/";
	 }
	 
	 @PostMapping("/update")
	 public String updateCourse(@ModelAttribute Course course) {

	     service.updateCourse(course);

	     return "redirect:/";
	 }
}
