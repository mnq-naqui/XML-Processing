package com.lara;

public class Book {
	private Integer id;
	private String title;
	private String author;

	public void setId(Integer id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return " id:" +  id  +  " title:"  +  title  +  " author:"  +  author;
	}
	
	
}
