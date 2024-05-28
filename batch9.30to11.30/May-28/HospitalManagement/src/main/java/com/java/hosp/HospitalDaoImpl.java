package com.java.hosp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HospitalDaoImpl implements HospitalDao {

	SessionFactory sessionFactory;
	Session session;
	
	@Override
	public String addHospital(Hospital hospital) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(hospital);
		transaction.commit();
		String msg = "Hospital Information added...\n future we will in touch...\n Your Id " +hospital.getHospitalId();
		SendMail.mailSend(hospital.getEmail(), "Hospital Info Added", msg);
		return "Hospital Information Added...";
	}

}
