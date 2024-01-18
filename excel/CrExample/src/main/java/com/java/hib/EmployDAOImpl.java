package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployDAOImpl implements EmployDAO {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public List<Employ> showEmploy() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.addOrder(Order.desc("dept"));
		List<Employ> employList = cr.list();
		return employList;
	}

	@Override
	public Employ searchEmploy(int empno) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.add(Restrictions.eq("empno", empno));
		Employ employ = (Employ) cr.uniqueResult();
		return employ;
	}

	@Override
	public List<Object[]> showProjections() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
//		Projection projection1 = Projections.property("name");
//		Projection projection2 = Projections.property("gender");
//		Projection projection3 = Projections.property("basic");
//		 
//		ProjectionList projectionList = Projections.projectionList();
//		projectionList.add(projection1);
//		projectionList.add(projection2);
//		projectionList.add(projection3);
//		cr.setProjection(projectionList);
//		List<Object> list = cr.list();
//		return list;
		//Criteria cr = session.createCriteria(Employ.class);
		List<Object[]> results = session.createCriteria(Employ.class)
				.setProjection(Projections.projectionList()
			.add(Projections.property("empno"),"eno")
			.add(Projections.property("name"),"nam")
			.add(Projections.property("gender"),"gen")
			.add(Projections.property("basic"),"bas")
					).list();
		return results;
		}

	@Override
	public long authenticate(String user, String pwd) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Users.class);
		cr.add(Restrictions.eq("userName", user));
		cr.add(Restrictions.eq("passCode", pwd));
		cr.setProjection(Projections.rowCount());
		long  count =(Long)cr.uniqueResult();
		return count;
	}

	@Override
	public String addUser(Users user) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		String encr = EntryptPassword.getCode(user.getPassCode());
		user.setPassCode(encr);
		//Criteria cr = session.createCriteria(Users.class);
		Transaction trans = session.beginTransaction();
		session.save(user);
		trans.commit();
		return "User Created...";
	}
	

}
