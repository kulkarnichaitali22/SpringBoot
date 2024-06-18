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

import com.Super20.Entity.ClassSchedule;
import com.Super20.Service.Class_scheduleService;

@RestController
public class Class_scheduleController {

	@Autowired
	Class_scheduleService service ;
	
	@PostMapping("/api/addClassSchedule")
	public ClassSchedule addClassSchedule(@RequestBody ClassSchedule classSchedule)
	{
		return service.addSchedule(classSchedule);
	}
	
	@GetMapping("/api/getAllClassSchedule")
	public List<ClassSchedule> getAllClassSchedule()
	{
		return service.getAllClassSchedule();
	}
	
	@GetMapping("/api/getClassSchedulebyid/{id}")
	public ClassSchedule getClassScheduleById(@PathVariable("id") int id)
	{
		return service.getClassScheduleById(id);
	}
	
	@PutMapping("/api/updateClassSchedule")
	public ClassSchedule updateClassSchedule(@RequestBody ClassSchedule classSchedule)
	{
		return service.updateClassSchedule(classSchedule);
	}
	
	@DeleteMapping("/api/deleteClassSchedulebyid/{id}")
	public void deleteClassScheduleById(@PathVariable("id") int id)
	{
		service.deleteClassScheduleById(id);
	}
}
