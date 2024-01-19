package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployDAOImpl implements EmployDAO {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		return employList;
	}

	@Override
	public Employ searchEmploy(int empno) {
		SessionFactory sf = SessionHelper.getConnection();
  	    Session session=sf.openSession();  
  	    Query query = session.getNamedQuery("searchEmploy");
		query.setParameter("empno", empno);   
		Employ employ = (Employ)query.uniqueResult();
		return employ;
	}

	@Override
	public int validate(String user, String pwd) {
		String encr = EntryptPassword.getCode(pwd);
		SessionFactory sf = SessionHelper.getConnection();
  	    Session session=sf.openSession();  
  	    Query query = session.getNamedQuery("validate");
		query.setParameter("userName", user);
		query.setParameter("passCode", encr.trim());
		Users userFound = (Users)query.uniqueResult();
		if (userFound!=null) {
			return 1;
		}
		return 0;
	}

}
