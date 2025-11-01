package com.mini_lms;

import java.util.Date;

public class Book {
	
	private String title;
	private String ISBN;
	private String authorName;
	private Date publicationDate;
	

	public Book() {
		this.title = title;
		this.ISBN = ISBN;
		this.authorName = authorName;
		this.publicationDate = publicationDate;
	}
	

	public Book(String title, String iSBN, String authorName, Date publicationDate) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.authorName = authorName;
		this.publicationDate = publicationDate;
	}

	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public Date getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
