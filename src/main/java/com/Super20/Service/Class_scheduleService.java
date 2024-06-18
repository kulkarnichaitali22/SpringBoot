package com.Super20.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Super20.Dao.Class_scheduleDao;
import com.Super20.Entity.ClassSchedule;
import com.Super20.Entity.Course;

@Service
public class Class_scheduleService {

	@Autowired
	Class_scheduleDao dao ;
	
	public ClassSchedule addSchedule(ClassSchedule classSchedule)
	{
		return dao.addSchedule(classSchedule);
	}
	

	public List<ClassSchedule> getAllClassSchedule()
	{
		return dao.getAllClassSchedule();
	}
	
	public ClassSchedule getClassScheduleById(int id)
	{
		return dao.getClassScheduleById(id);
	}
	
	public ClassSchedule updateClassSchedule(ClassSchedule classSchedule)
	{
		return dao.updateClassSchedule(classSchedule);
	}
	
	public void deleteClassScheduleById(int id)
	{
		dao.deleteClassSchedule(id);
	}
}
