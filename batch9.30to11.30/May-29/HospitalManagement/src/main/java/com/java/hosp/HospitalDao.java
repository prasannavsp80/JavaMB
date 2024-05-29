package com.java.hosp;

import java.util.List;

public interface HospitalDao {

	String addHospital(Hospital hospital);
	List<Hospital> showHospital();
	List<Hospital> showAllCities();
	List<Hospital> searchByCity(String city);
	List<Hospital> searchByCityNetworkHosp(String city);
}
