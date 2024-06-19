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

import com.Super20.Entity.Faculty;
import com.Super20.Service.FacultyService;

@RestController
public class FacultyController {

	@Autowired
	FacultyService service;
	
	@PostMapping("/api/addFaculty")
	public Faculty addFaculty(@RequestBody Faculty faculty)
	{
		return service.addFaculty(faculty);
	}
	
	@GetMapping("/api/getallfaculty")
	public List<Faculty> getAllFaculty()
	{
		return service.getAllFaculty();
	}
	
	@GetMapping("/api/getfacultybyid/{id}")
	public Faculty getFacultyById(@PathVariable("id") Long id)
	{
		return service.getFacultyById(id);
	}
	
	@PutMapping("/api/updatefaculty")
	public Faculty updateFaculty(@RequestBody Faculty faculty)
	{
		return service.updateFaculty(faculty);
	}
	
	@DeleteMapping("/api/deletefacultybyid/{id}")
	public void deleteFacultyById(@PathVariable("id") Long id)
	{
		service.deleteFacultyById(id);
	}
}
