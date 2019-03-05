package com.objectified.dto;

import java.sql.Date;

public class Batch {
	private String id;
	private String courseId;
	private Date date;
	private int weeks;
	
	public Batch(String id, String courseId, Date date, int weeks) 
	{
		super();
		this.id = id;
		this.courseId = courseId;
		this.date = date;
		this.weeks = weeks;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getWeeks() {
		return weeks;
	}

	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}
	
	
	

}
