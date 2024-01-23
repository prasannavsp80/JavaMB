package com.java.hib;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainProg {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employ employ1= new Employ();
		employ1.setName("Aditya");
		employ1.setEmail("aditya@infinite.com");
		
		Address address1 = new Address();
		address1.setAddress1("Jaya Nagar");
		address1.setAddress2("Sulthan Palya");
		address1.setCity("Bangalore");
		address1.setState("KA");
		address1.setZipcode("8472344");
		address1.setCountry("INDIA");
		
		employ1.setAddress(address1);
		address1.setEmploy(employ1);
		
		Employ employ2 = new Employ();
		employ2.setName("Chandu");
		employ2.setEmail("chandu@infinite.com");
		
		Address address2 = new Address();
		address2.setAddress1("MVP Colony");
		address2.setAddress2("Sector 3");
		address2.setCity("Vizag");
		address2.setState("AP");
		address2.setZipcode("482344");
		address2.setCountry("INDIA");
		
		employ2.setAddress(address2);
		address2.setEmploy(employ2);
		
		session.save(employ1);
		session.save(employ2);
		transaction.commit();
		session.close();
		System.out.println("Tables Created Successfully...");

	}
}
