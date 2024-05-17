package com.java.customer;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class CustomerDaoImpl implements CustomerDao {

	SessionFactory sessionFactory;
	
	public String changePassword(int custId, String passWord, String authCode) {
		sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(CustomerAuth.class);
		cr.add(Restrictions.eq("custId", custId));
		cr.add(Restrictions.eq("passwordReason", "Reset Password"));
		cr.add(Restrictions.eq("genCode", authCode));
		CustomerAuth auth = (CustomerAuth)cr.uniqueResult();
		if (auth!=null) {
			cr = session.createCriteria(Customer.class);
			cr.add(Restrictions.eq("custId", custId));
			Customer customer = (Customer)cr.uniqueResult();
			String encr = EncryptPassword.getCode(passWord);
			customer.setCustomerPassword(encr);
			Transaction trans = session.beginTransaction();
			session.save(customer);
			trans.commit();
			return "Password Updated Successfully...";
		}
		return "Record Not Found...";
	}
	public Customer searchByUserName(String userName) {
		sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		cr.add(Restrictions.eq("customerUserName", userName));
		Customer customer = (Customer)cr.uniqueResult();
		if (customer!=null) {
			String gencode = GenerateCode.createPassword();
			SendMail.mailSend(customer.getCustomerEmail(), "Reset Password Code", gencode);
			CustomerAuth auth = new CustomerAuth();
			auth.setCustId(customer.getCustId());
			auth.setPasswordReason("Reset Password");
			auth.setGenCode(gencode);
			Transaction trans = session.beginTransaction();
			session.save(auth);
			trans.commit();
			return customer;
		}
		return null;
	}
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

	@Override
	public int authenticate(String customerUser, String authCode) {
		sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		cr.add(Restrictions.eq("customerUserName", customerUser));
		Customer customer = (Customer)cr.uniqueResult();
		int custId = customer.getCustId();
		cr = session.createCriteria(CustomerAuth.class);
		cr.add(Restrictions.eq("custId", custId));
		cr.add(Restrictions.eq("genCode", authCode));
		CustomerAuth auth = (CustomerAuth)cr.uniqueResult();
		if (auth!=null) {
			return 1;
		}
		return 0;
	}

	@Override
	public String updatePassword(String customerUser, String customerPassword) {
		String encr = EncryptPassword.getCode(customerPassword);
		sessionFactory = SessionHelper.getSession();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Customer.class);
		cr.add(Restrictions.eq("customerUserName", customerUser));
		Customer customer = (Customer)cr.uniqueResult();
		customer.setCustomerPassword(encr);
		Transaction trans = session.beginTransaction();
		session.saveOrUpdate(customer);
		trans.commit();
		return "Password Updated Successfully...";
	}

}
