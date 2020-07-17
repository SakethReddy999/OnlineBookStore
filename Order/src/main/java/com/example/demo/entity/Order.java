package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "OrderData")
public class Order {
	@Id
	private String Book_description;
	private int Book_price;
	private String Book_name;
	private int ISBN_No;
	private int Book_id;
	private String Book_author;
	private Date publish_date;
	private String Book_title;
	public String getBook_title() {
		return Book_title;
	}

	public void setBook_title(String book_title) {
		Book_title = book_title;
	}

	public String getBook_description() {
		return Book_description;
	}

	public void setBook_description(String book_description) {
		Book_description = book_description;
	}

	public int getBook_price() {
		return Book_price;
	}

	public void setBook_price(int book_price) {
		Book_price = book_price;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public int getISBN_No() {
		return ISBN_No;
	}

	public void setISBN_No(int iSBN_No) {
		ISBN_No = iSBN_No;
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public String getBook_author() {
		return Book_author;
	}

	public void setBook_author(String book_author) {
		Book_author = book_author;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
}

	
	
	

	