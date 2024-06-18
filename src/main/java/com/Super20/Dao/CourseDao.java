package com.Super20.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Super20.Entity.Course;

@Repository
public class CourseDao {
	

	@Autowired
	SessionFactory sf;
	
	public Course addCourse(Course course)
	{
		Session session = sf.openSession();
		session.save(course);
		session.beginTransaction().commit();
		return course;
	}
	
	public List<Course> getAllCourses()
	{
		Session session = sf.openSession();
		List<Course> list = session.createQuery("from Course", Course.class).list();
		return list;
	}
	
	public Course getCourseById(Long course_id)
	{
		Session session = sf.openSession();
		Course course = session.get(Course.class, course_id);
		session.save(course);
		session.beginTransaction().commit();
		return course;
	}
	
	public Course updateCourse(Course course)
	{
		Session session = sf.openSession();
		session.update(course);
		session.beginTransaction().commit();
		return course;
	}
	
	public void deleteCourse(Long course_id)
	{
		Session session = sf.openSession();
		Course course = session.get(Course.class, course_id);
		session.delete(course);
		session.beginTransaction().commit();
	}

}
