package com.Super20.Entity;

import javax.persistence.*;

@Entity
public class ClassSchedule {
	
	@Id
	private int id;
	private int classroom_id;
	private String day_of_week;
	private String start_time;
	private String end_time;
	private String subject_id;
	
	public ClassSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassSchedule(int id, int classroom_id, String day_of_week, String start_time, String end_time,
			String subject_id) {
		super();
		this.id = id;
		this.classroom_id = classroom_id;
		this.day_of_week = day_of_week;
		this.start_time = start_time;
		this.end_time = end_time;
		this.subject_id = subject_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClassroom_id() {
		return classroom_id;
	}
	public void setClassroom_id(int classroom_id) {
		this.classroom_id = classroom_id;
	}
	public String getDay_of_week() {
		return day_of_week;
	}
	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", classroom_id=" + classroom_id + ", day_of_week=" + day_of_week
				+ ", start_time=" + start_time + ", end_time=" + end_time + ", subject_id=" + subject_id + "]";
	}
	
	

}
