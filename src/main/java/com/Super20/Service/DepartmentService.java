package com.Super20.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Super20.Dao.DepartmentDao;
import com.Super20.Entity.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDao dao ;
	
	public Department addDepartment(Department department)
	{
		return dao.addDepartment(department);
	}
	
	public List<Department> getAllDepartment()
	{
		return dao.getAllDepartment();
	}
	
	public Department getDepartmentById(Long dept_id)
	{
		return dao.getDepartmentById(dept_id);
	}
	
	public Department updateDepartment(Department department)
	{
		return dao.updateDepartment(department);
	}
	
	public void deleteDepartmentById(Long dept_id)
	{
		dao.deleteDepartment(dept_id);
	}
	
}
