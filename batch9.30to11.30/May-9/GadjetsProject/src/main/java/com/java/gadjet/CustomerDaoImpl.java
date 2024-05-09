package com.java.gadjet;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class CustomerDaoImpl implements CustomerDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Customers> showCustomer() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Customers.class);
		return cr.list();
	}

	@Override
	public int LoginCheck(Login login) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Login.class);
		cr.add(Restrictions.eq("userName", login.getUserName()));
		cr.add(Restrictions.eq("passCode", login.getPassCode()));
		List<Login> loginList = cr.list();
		return loginList.size();
	}

}
