package com.Super20.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Super20.Dao.SubjectDao;
import com.Super20.Entity.Subject;

@Service
public class SubjectService {

	@Autowired
	SubjectDao dao;
	
	public Subject addSubject(Subject subject)
	{
		return dao.addSubject(subject); 
	}
	
	public List<Subject> getAllSubject()
	{
		return dao.getAllSubject();
	}
	
	public Subject getSubjectById(Long id)
	{
		return dao.getSubjectById(id);
	}
	
	public Subject updateSubject(Subject subject)
	{
		return dao.updateSubject(subject);
	}
	
	public void deleteSubjectById(Long id)
	{
		dao.deleteSubject(id);
	}
}
