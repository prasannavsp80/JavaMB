package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDAOImpl implements EmployDAO {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public Employ searchEmploy(int empno) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Employ Where empno=" +empno);
		//session.close();
		Employ employFound = (Employ) query.uniqueResult();
		return employFound;
	}

	@Override
	public String updateEmploy(Employ employUpdated) {
		sessionFactory = SessionHelper.getConnection();
		Transaction transaction = session.beginTransaction();
		session.merge(employUpdated);
		transaction.commit();
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmploy(int empno) {
		sessionFactory = SessionHelper.getConnection();
		Employ employFound = searchEmploy(empno);
		Transaction transaction = session.beginTransaction();
		session.delete(employFound);
		transaction.commit();
		return "Employ Record Deleted...";
	}

	@Override
	public String addEmploy(Employ employNew) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employNew);
		trans.commit();
		return "Employ Record Inserted...";
	}

	@Override
	public int validateUser(String user, String pwd) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.createQuery("from Users where userName='" +user + "' AND "
				+ " passCode ='" +pwd + "'");
		Users users = (Users) query.uniqueResult();
		if (users != null) {
			return 1;
		}
		return 0;
	}
}
