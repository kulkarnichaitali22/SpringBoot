package com.Super20.Entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Faculty_attendence {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@ManyToOne
		@JoinColumn(name = "faculty_id", nullable = false)
		private Faculty faculty;

		@ManyToOne
		@JoinColumn(name = "id", nullable = false)
		private ClassSchedule classSchedule;

		@Temporal(TemporalType.DATE)
		private Date date;

		private String status;

		public Faculty_attendence() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Faculty_attendence( Faculty faculty, ClassSchedule classSchedule, Date date, String status) {
			super();
			this.faculty = faculty;
			this.classSchedule = classSchedule;
			this.date = date;
			this.status = status;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Faculty getFaculty() {
			return faculty;
		}

		public void setFaculty(Faculty faculty) {
			this.faculty = faculty;
		}

		public ClassSchedule getClassSchedule() {
			return classSchedule;
		}

		public void setClassSchedule(ClassSchedule classSchedule) {
			this.classSchedule = classSchedule;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "Faculty_attendence [id=" + id + ", faculty=" + faculty + ", classSchedule=" + classSchedule
					+ ", date=" + date + ", status=" + status + "]";
		}
		
		
}
