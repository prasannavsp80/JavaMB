package com.java.hosp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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

	@Override
	public List<Hospital> showHospital() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Hospital.class);
		return cr.list();
	}

	@Override
	public List<Hospital> showAllCities() {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Hospital.class).setProjection(
			        Projections.distinct(Projections.property("city")));
			List<Hospital> rsList = criteria.list();
		return rsList;
	}

	@Override
	public List<Hospital> searchByCity(String city) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Hospital.class);
		cr.add(Restrictions.eq("city", city));
		return cr.list();
	}

	@Override
	public List<Hospital> searchByCityNetworkHosp(String city) {
		sessionFactory = SessionHelper.getConnection();
		session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Hospital.class);
		cr.add(Restrictions.eq("city", city));
		cr.add(Restrictions.eq("isNetwork", 1));
		return cr.list();
	}

}
