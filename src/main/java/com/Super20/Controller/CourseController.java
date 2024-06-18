package com.Super20.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Super20.Entity.Course;
import com.Super20.Service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService course_service;
 
	@PostMapping("/api/addcourses")
	public Course addCourse(@RequestBody Course course)
	{
		return course_service.addCourse(course);
	}
	
	@GetMapping("/api/getallcourses")
	public List<Course> getAllCourses()
	{
		return course_service.getAllCourses();
	}
	
	@GetMapping("/api/getcoursebyid/{course_id}")
	public Course getCourseBuId(@PathVariable("course_id") Long course_id)
	{
		return course_service.getCourseById(course_id);
	}
	
	@PutMapping("/api/updateCourse")
	public Course updateCourse(@RequestBody Course course)
	{
		return course_service.updateCourse(course);
	}
	
	@DeleteMapping("/api/deletecoursebyid/{course_id}")
	public void deleteCourseById(@PathVariable("course_id") Long course_id)
	{
		course_service.deleteCourseById(course_id);
	}
	
}
