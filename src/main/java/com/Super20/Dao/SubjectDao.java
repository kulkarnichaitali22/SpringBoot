package com.Super20.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Super20.Entity.Subject;

@Repository
public class SubjectDao {

	@Autowired
	SessionFactory sf;
	
	public Subject addSubject(Subject subject)
	{
		Session session = sf.openSession();
		session.save(subject);
		session.beginTransaction().commit();
		return subject;
	}
	
	public List<Subject> getAllSubject()
	{
		Session session = sf.openSession();
		List<Subject> list = session.createQuery("from Subject", Subject.class).list();
		return list;
	}
	
	public Subject getSubjectById(Long id)
	{
		Session session = sf.openSession();
		Subject subject = session.get(Subject.class, id);
		session.save(subject);
		session.beginTransaction().commit();
		return subject;
	}
	
	public Subject updateSubject(Subject subject)
	{
		Session session = sf.openSession();
		session.update(subject);
		session.beginTransaction().commit();
		return subject;
	}
	
	public void deleteSubject(Long id)
	{
		Session session = sf.openSession();
		Subject subject = session.get(Subject.class, id);
		session.delete(subject);
		session.beginTransaction().commit();
	}

	
	
}
