package com.java.gadjet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {

	@Id
	@Column(name="UserName")
	private String userName;
	@Column(name="PassCode")
	private String passCode;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassCode() {
		return passCode;
	}
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	public Login(String userName, String passCode) {
		this.userName = userName;
		this.passCode = passCode;
	}
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	
}
