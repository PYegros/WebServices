package com.ga.gaAcademy.pyegros.webServices.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "datePost")
	private Date datePost = new Date();

	@Column(name = "descipction")
	private String description;
	
	@Column(name = "author")
	private int author;
	
	@Column(name = "status")
	private boolean deleted;
	
	
	public Topic() {}

	public Topic(String title, Date datePost, String description, int author, boolean deleted) {
		super();
		this.title = title;
		this.datePost = new Date();
		this.description = description;
		this.author = author;
		this.deleted = deleted;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	
	public boolean isDeleted(){
	 	return deleted;
	 }
	
	public boolean setDeleted(boolean deleted){
		return this.deleted = deleted;
	 }
	 
	public void delete()
	{
		this.deleted=true;
	}
}
