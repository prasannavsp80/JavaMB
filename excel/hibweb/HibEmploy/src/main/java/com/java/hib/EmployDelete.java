package com.java.hib;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployDelete {

	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno = sc.nextInt();
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from EmployExcel where empno=" +empno);
		EmployExcel employFound = (EmployExcel) query.uniqueResult();
		session.close();
		session= sf.openSession();
		if (employFound !=null) {
			Transaction trans = session.beginTransaction();
			session.delete(employFound);
			trans.commit();
			System.out.println("Record Deleted...");
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
