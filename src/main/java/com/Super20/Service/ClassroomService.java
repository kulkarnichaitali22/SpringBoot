package com.Super20.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Super20.Dao.ClassroomDao;
import com.Super20.Entity.Classroom;

@Service
public class ClassroomService {
	
	@Autowired
	ClassroomDao dao;
	
	public Classroom addClassroom(Classroom room) {
		return dao.addClassroom(room);
	}

	public List<Classroom> getAllClassroom() {
		return dao.getAllClassroom();
	}
	
	public Classroom getClassroomById(Long id) {
		return dao.getClassroomById(id);
	}
	
	public Classroom updateProduct(Classroom room) {
		return dao.updateProduct( room);
	}
	
	public Classroom deleteClassroom(Long class_id) {
		 return dao.deleteClassroom(class_id);
	}
	
	
}
