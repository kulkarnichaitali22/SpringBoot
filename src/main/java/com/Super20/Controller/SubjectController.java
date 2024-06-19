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

import com.Super20.Entity.Subject;
import com.Super20.Service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	SubjectService service;
	
	@PostMapping("/api/addSubject")
	public Subject addSubject(@RequestBody Subject subject)
	{
		return service.addSubject(subject);
	}
	
	@GetMapping("/api/getallSubject")
	public List<Subject> getAllSubject()
	{
		return service.getAllSubject();
	}
	
	@GetMapping("/api/getSubjectbyid/{id}")
	public Subject getSubjectById(@PathVariable("id") Long id)
	{
		return service.getSubjectById(id);
	}
	
	@PutMapping("/api/updateSubject")
	public Subject updateSubject(@RequestBody Subject subject)
	{
		return service.updateSubject(subject);
	}
	
	@DeleteMapping("/api/deleteSubjectbyid/{id}")
	public void deleteSubjectById(@PathVariable("id") Long id)
	{
		service.deleteSubjectById(id);
	}
}
