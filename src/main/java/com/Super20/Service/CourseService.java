package com.Super20.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Super20.Dao.CourseDao;
import com.Super20.Entity.Course;

@Service
public class CourseService {
	
	@Autowired
	CourseDao dao;
	
	public Course addCourse(Course course)
	{
		return dao.addCourse(course); 
	}
	
	public List<Course> getAllCourses()
	{
		return dao.getAllCourses();
	}
	
	public Course getCourseById(Long course_id)
	{
		return dao.getCourseById(course_id);
	}
	
	public Course updateCourse(Course course)
	{
		return dao.updateCourse(course);
	}
	
	public void deleteCourseById(Long course_id)
	{
		dao.deleteCourse(course_id);
	}

}
