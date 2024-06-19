package com.Super20.Entity;

import javax.persistence.*;

@Entity
public class Subject {
	
	@Id
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(name = "course_id", nullable = false)
	private Long courseId;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(Long id, String name, Long courseId) {
		super();
		this.id = id;
		this.name = name;
		this.courseId = courseId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", courseId=" + courseId + "]";
	}
	
	


}
