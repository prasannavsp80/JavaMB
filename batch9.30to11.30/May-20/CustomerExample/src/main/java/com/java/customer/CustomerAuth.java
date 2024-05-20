package com.java.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerAuth")
public class CustomerAuth {

	@Id
	@Column(name="AuthId")
	private int authId;
	@Column(name="CustId")
	private int custId;
	@Column(name="PasswordReason")
	private String passwordReason;
	@Column(name="GenCode")
	private String genCode;
	
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getPasswordReason() {
		return passwordReason;
	}
	public void setPasswordReason(String passwordReason) {
		this.passwordReason = passwordReason;
	}
	public String getGenCode() {
		return genCode;
	}
	public void setGenCode(String genCode) {
		this.genCode = genCode;
	}
	
	public CustomerAuth() {
	}

	public CustomerAuth(int authId, int custId, String passwordReason, String genCode) {
		this.authId = authId;
		this.custId = custId;
		this.passwordReason = passwordReason;
		this.genCode = genCode;
	}
	
	
}
