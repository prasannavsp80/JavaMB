package com.java.hib;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployUpdate {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		int empno = sc.nextInt();
		Query query = session.createQuery("from EmployExcel where empno=" +empno);
		EmployExcel employFound = (EmployExcel) query.uniqueResult();
		session.close();
		session= sf.openSession();
		if (employFound !=null) {
			EmployExcel employUpdate = new EmployExcel();
			employUpdate.setEmpno(empno);
			System.out.println("Enter Name  ");
			employUpdate.setName(sc.next());
			System.out.println("Enter Gender  ");
			employUpdate.setGender(sc.next());
			System.out.println("Enter Department   ");
			employUpdate.setDept(sc.next());
			System.out.println("Enter Designation  ");
			employUpdate.setDesig(sc.next());
			System.out.println("Enter Basic   ");
			employUpdate.setBasic(sc.nextDouble());
			Transaction trans = session.beginTransaction();
			session.update(employUpdate);
			trans.commit();
			System.out.println("Employ Record Updated...");
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
