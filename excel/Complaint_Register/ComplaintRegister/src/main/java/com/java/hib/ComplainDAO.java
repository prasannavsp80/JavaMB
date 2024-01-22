package com.java.hib;

import java.util.List;

public interface ComplainDAO {

	String addComplaint(Complaint complaint);
	List<Complaint> showComplaint();
	List<Complaint> showPendingComplaint();
	Complaint searchByComplaintId(String complaintId);
}
