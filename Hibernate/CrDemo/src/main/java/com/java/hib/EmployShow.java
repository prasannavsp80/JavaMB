package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

public class EmployShow {

	public static void main(String[] args) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		cr.addOrder(Order.asc("basic"));
		List<Employ> employList = cr.list();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
