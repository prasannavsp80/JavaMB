package com.java.hib;

import java.sql.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ComplaintDAOImpl implements ComplainDAO {

	SessionFactory sessionFactory;
	Session session;
	
	public String generateComplaintId() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Complaint.class);
		Integer totalResult = ((Number)cr.setProjection(Projections.rowCount()).uniqueResult()).intValue();
		if (totalResult == 0) {
			return "C001";
		} else {
				    cr.setProjection(Projections.max("complaintId"));
				String  compId = (String)cr.uniqueResult();
				int cid = Integer.parseInt(compId.substring(1));
				cid++;
				String result="";
				if (cid >= 1 && cid <= 9) {
					result="C00"+cid;
				}
				if (cid >= 10 && cid <= 99) {
					result="C0" + cid;
				}
				if (cid >= 100 && cid <= 999) {
					result="C"+cid;
				}
			return result;
		}
	}
	
	@Override
	public String addComplaint(Complaint complaint) {
		String id = generateComplaintId();
		complaint.setComplaintId(id);
		complaint.setStatus("Pending");
		java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
		complaint.setComplaintDate(sqlDate);
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		session.save(complaint);
		tran.commit();
		return "Complaint Registered Successfully...";
	}

	@Override
	public List<Complaint> showComplaint() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Complaint.class);
		List<Complaint> clist = cr.list();
		return clist;
	}
	
	public int tat(Date cdate) {
		java.util.Date date = new java.util.Date(cdate.getTime());
		java.util.Date today = new java.util.Date();
		long ms = today.getTime() - date.getTime();
		int days = (int) ms /(1000 * 60 * 60 * 24);
		days++;
		return days;
	} 

	@Override
	public List<Complaint> showPendingComplaint() {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Complaint.class);
		cr.add(Restrictions.eq("status", "Pending"));
		List<Complaint> clist = cr.list();
		return clist;
	}

	@Override
	public Complaint searchByComplaintId(String complaintId) {
		sessionFactory = SessionHelper.getSession();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Complaint.class);
		cr.add(Restrictions.eq("complaintId", complaintId));
		Complaint complaint = (Complaint) cr.uniqueResult();
		return complaint;
	}

}
