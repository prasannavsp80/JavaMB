package com.java.gadjet;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductDaoImpl implements ProductsDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public String addProductDao(Products product) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(product);
		trans.commit();
		SendMail.mailSend("tharakb504@gmail.com", "My First Mail", "Product Added...");
		return "Product Added...";
	}

}
