package com.java.lib;

import java.sql.Date;

public class TranBook {
           
	private int bookId;
	private String userName;
	private Date fromDate;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	public TranBook() {

	}
	public TranBook(int bookId, String userName, Date fromDate) {
		this.bookId = bookId;
		this.userName = userName;
		this.fromDate = fromDate;
	}
	
	
}
