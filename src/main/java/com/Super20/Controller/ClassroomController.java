package com.Super20.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Super20.Entity.Classroom;
import com.Super20.Service.ClassroomService;

@RestController
public class ClassroomController {

	@Autowired
	ClassroomService service;

	@PostMapping("/api/addClassroom")
	public Classroom addClassroom(@RequestBody Classroom room) {
		return service.addClassroom(room);
	}

	@GetMapping("/api/getallclassroom")
	public List<Classroom> getAllClassroom() {
		return service.getAllClassroom();
	}

	@GetMapping("/api/getClassroomById/{id}")
	public Classroom getClassroomById(@PathVariable("class_id") Long id) {
		return service.getClassroomById(id);
	}

	@PutMapping("/api/classrooms")
	public ResponseEntity<Classroom> updateProduct(@RequestBody Classroom room) {
		
		System.out.println(room);
		Classroom dbRoom = service.updateProduct(room);
		return ResponseEntity.ok(dbRoom);
	}
	
	@DeleteMapping("/api/deleteClassroom/{class_id}")
	public Classroom deleteClassroom(@PathVariable("class_id") Long class_id)
	{
		return service.deleteClassroom(class_id);
	}

}
