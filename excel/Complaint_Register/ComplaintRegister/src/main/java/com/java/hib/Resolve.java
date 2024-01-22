package com.java.hib;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Resolve")
public class Resolve {

	@Id
	@Column(name="resolveId")
	private String resolveId;
	@Column(name="ComplaintID")
	private String complaintId;
	@Column(name="ComplaintDate")
	private Date complaintDate;
	@Column(name="ResolveDate")	
	private Date resolveDate;
	@Column(name="ResolvedBy")
	private String resolvedBy;
	@Column(name="Comments")
	private String comments;
	public String getResolveId() {
		return resolveId;
	}
	public void setResolveId(String resolveId) {
		this.resolveId = resolveId;
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public Date getComplaintDate() {
		return complaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}
	public Date getResolveDate() {
		return resolveDate;
	}
	public void setResolveDate(Date resolveDate) {
		this.resolveDate = resolveDate;
	}
	public String getResolvedBy() {
		return resolvedBy;
	}
	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
