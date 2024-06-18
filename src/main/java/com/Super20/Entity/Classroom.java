package com.Super20.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long class_id;
	private String name;
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Classroom(String name) {
		super();
		this.name = name;
	}
	
	
	public Long getClass_id() {
		return class_id;
	}

	public void setClass_id(Long class_id) {
		this.class_id = class_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classroom [id=" + class_id + ", name=" + name + "]";
	}
	
	
}
