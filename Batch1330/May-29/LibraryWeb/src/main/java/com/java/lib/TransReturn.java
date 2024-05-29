package com.java.lib;

import java.sql.Date;

public class TransReturn {

	private int bookId;
	private String userName;
	private Date fromDate;
	private Date toDate;
	
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
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	public TransReturn() {

	}

	public TransReturn(int bookId, String userName, Date fromDate, Date toDate) {
		this.bookId = bookId;
		this.userName = userName;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	
}
