package com.Super20.Entity;

import javax.persistence.*;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dept_id;
	private String dept_name;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String dept_name) {
		super();
		this.dept_name = dept_name;
	}
	public Long getDept_id() {
		return dept_id;
	}
	public void setDept_id(Long dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}
	
	
}
