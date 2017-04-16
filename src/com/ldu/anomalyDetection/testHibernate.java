package com.ldu.anomalyDetection;
//这个类是测试hibernate

import java.util.Date;

public class testHibernate {

	private int id;
	private String title;
	private String author;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

	public testHibernate(String title, String author, Date date) {
		super();
		this.title = title;
		this.author = author;
		this.date = date;
	}
	
	public testHibernate() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "testHibernate [id=" + id + ", title=" + title + ", author=" + author + ", date=" + date + "]";
	}
	
	
	
	
}
