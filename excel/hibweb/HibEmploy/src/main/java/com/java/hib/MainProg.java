package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from EmployExcel");
		List<EmployExcel> employList = query.list();
		System.out.println("Employ Records are  ");
		for (EmployExcel employExcel : employList) {
			System.out.println(employExcel);
		}
	}
}
