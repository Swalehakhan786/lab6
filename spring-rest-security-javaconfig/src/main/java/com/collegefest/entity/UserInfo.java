package com.collegefest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="students")
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="student_id")
	private int student_id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")	
	private String last_name;
	@Column(name="Course")	
	private String Course;
	@Column(name="country")	
	private String country;
	public int getstudent_id() {
		return student_id;
	}
	public void setstudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getfirst_name() {
		return first_name;
	}
	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getlast_name() {
		return last_name;
	}
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String Course) {
		this.Course = Course;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
