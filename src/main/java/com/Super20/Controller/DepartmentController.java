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

import com.Super20.Entity.Department;
import com.Super20.Service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/api/addDepartment")
	public Department addDepartment(@RequestBody Department department)
	{
		return service.addDepartment(department);
	}
	
	@GetMapping("/api/getalldepartment")
	public List<Department> getAllDepartment()
	{
		return service.getAllDepartment();
	}
	
	@GetMapping("/api/getDepartmentById/{dept_id}")
	public Department getDepartmentById(@PathVariable("dept_id") Long dept_id)
	{
		return service.getDepartmentById(dept_id);
	}
	
	@PutMapping("/api/updateDepartment")
	public Department updateDepartment(@RequestBody Department department)
	{
		return service.updateDepartment(department);
	}
	
	@DeleteMapping("/api/deleteDepartmentById/{dept_id}")
	public void eleteDepartmentById(@PathVariable("dept_id") Long dept_id)
	{
		service.deleteDepartmentById(dept_id);
	}
}
