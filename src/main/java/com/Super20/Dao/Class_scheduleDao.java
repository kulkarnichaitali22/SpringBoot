package com.Super20.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Super20.Entity.ClassSchedule;
import com.Super20.Entity.Classroom;
import com.Super20.Entity.Course;

@Repository
public class Class_scheduleDao {

	@Autowired
	SessionFactory sf;
	
	public ClassSchedule addSchedule(ClassSchedule classSchedule)
	{
		Session session = sf.openSession();
		session.save(classSchedule);
		session.beginTransaction().commit();
		return classSchedule;
	}
	
	public List<ClassSchedule> getAllClassSchedule() {
		Session session = sf.openSession();
		List<ClassSchedule> classSchedule = session.createQuery("from ClassSchedule", ClassSchedule.class).list();
		return classSchedule;
	}
	
	public ClassSchedule getClassScheduleById(int id) {
		Session session = sf.openSession();
		ClassSchedule classSchedule = session.get(ClassSchedule.class, id);
		session.save(classSchedule);
		session.beginTransaction().commit();
		return classSchedule;
	}
	
	public ClassSchedule updateClassSchedule(ClassSchedule classSchedule)
	{
		Session session = sf.openSession();
		session.update(classSchedule);
		session.beginTransaction().commit();
		return classSchedule;
	}
	
	public void deleteClassSchedule(int id)
	{
		Session session = sf.openSession();
		ClassSchedule classSchedule = session.get(ClassSchedule.class, id);
		session.delete(classSchedule);
		session.beginTransaction().commit();
	}

}
