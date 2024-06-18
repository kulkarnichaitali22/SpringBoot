package com.Super20.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Super20.Entity.Classroom;

@Repository
public class ClassroomDao {

	@Autowired
	SessionFactory sf;

	public Classroom addClassroom(Classroom room) {
		Session session = sf.openSession();
		session.get(Classroom.class, room.getClass_id());
		session.save(room);
		session.beginTransaction().commit();
		return room;
	}

	public List<Classroom> getAllClassroom() {
		Session session = sf.openSession();
		List<Classroom> room = session.createQuery("from Classroom", Classroom.class).list();
		return room;
	}

	public Classroom getClassroomById(Long id) {
		Session session = sf.openSession();
		Classroom room = session.get(Classroom.class, id);
		session.save(room);
		session.beginTransaction().commit();
		return room;
	}

	public Classroom updateProduct(Classroom room) {
		Classroom classroom = null;
		try {
			Session session = sf.openSession();
			session.update(room);
			session.beginTransaction().commit();
			classroom = room;
		} catch (Exception e) {
			e.printStackTrace();
			classroom = null;
		}
		return classroom;

	}
	
	public Classroom deleteClassroom(Long class_id) {
		Session session = sf.openSession();
		Classroom classroom = session.get(Classroom.class, class_id);
		session.delete(classroom);
		session.beginTransaction().commit();
		return classroom;
	}
	
	

}
