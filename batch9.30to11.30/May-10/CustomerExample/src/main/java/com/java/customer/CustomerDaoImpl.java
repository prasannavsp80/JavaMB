package com.java.customer;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao {

	SessionFactory sessionFactory;
	
	@Override
	public String addCustomerDao(Customer customer) {
		CustomerAuth custAuth = new CustomerAuth();
		sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(customer);
		trans.commit();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		List<Customer> customerList = cr.list();
		int id = customerList.get(customerList.size()-1).getCustId();
		custAuth.setCustId(id);
		custAuth.setPasswordReason("Create Account");
		String code = GenerateCode.createPassword();
		custAuth.setGenCode(code);
		session = sessionFactory.openSession();
		trans = session.beginTransaction();
		session.save(custAuth);
		trans.commit();
		SendMail.mailSend(customer.getCustomerEmail(), "One Time Password", code);
		return "Customer Account Created with One Time Password...";
	}

}
