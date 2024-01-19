package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployDAOImpl implements EmployDAO {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<String> showNames() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.property("name"); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		return list;
	}

	@Override
	public List<String> showDept() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.distinct(Projections.property("dept")); 
		cr.setProjection(projection); 
		List<String> list = cr.list();
		return list;
	}

	@Override
	public List<Employ> showByDeptName(String dept) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("dept", dept));
		List<Employ> employList = cr.list();
		return employList;

	}

	@Override
	public long authenticate(String user, String pwd) {
		String encr = EntryptPassword.getCode(pwd);
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Users.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("passCode", encr.trim()));
		cr.setProjection(Projections.rowCount());
		long  count =(Long)cr.uniqueResult();
		return count;
	}

}
