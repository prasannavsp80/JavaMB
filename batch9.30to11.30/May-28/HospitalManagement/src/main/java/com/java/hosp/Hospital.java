package com.java.hosp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hospital")
public class Hospital {

	@Id
	private int hospitalId;
	private String hospitalName;
	private int isNetwork;
	private String hospitalType;
	private String city;
	private String address;
	private String mobile;
	private String email;

	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public int getIsNetwork() {
		return isNetwork;
	}
	public void setIsNetwork(int isNetwork) {
		this.isNetwork = isNetwork;
	}
	public String getHospitalType() {
		return hospitalType;
	}
	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Hospital() {

	}
	public Hospital(int hospitalId, String hospitalName, int isNetwork, String hospitalType, String city,
			String address, String mobile, String email) {
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.isNetwork = isNetwork;
		this.hospitalType = hospitalType;
		this.city = city;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	
	
}
