package com.java.bal;

import com.java.dao.EmployDaoImpl;
import com.java.exception.EmployException;
import com.java.model.Employ;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.java.dao.EmployDao;

public class EmployBal {

	static EmployDao dao; 
	static StringBuilder sb;
	
	static {
		dao = new EmployDaoImpl();
		sb = new StringBuilder();
	}
	
	public String writeFileBal() throws FileNotFoundException, IOException {
		return dao.storeFileDao();
	}
	
	public String readFileBal() throws FileNotFoundException, ClassNotFoundException, IOException {
		return dao.readFileDao();
	}
	
	public Employ searchEmployBal(int empno) {
		return dao.searchEmployDao(empno);
	}
	
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	
	public List<Employ> showEmployBal() {
		return dao.showEmployDao();
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ) == true) {
			return dao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)==true) {
			return dao.updateEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public static boolean validateEmploy(Employ employ) {
		boolean isValid = true;
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No Cannot be Zero or Negative...\r\n");
			isValid = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Employ Name Contains min. 5 characters...\r\n");
			isValid = false;
		}
		if (employ.getBasic() < 10000 || employ.getBasic() > 90000) {
			sb.append("Employ Salary Must be Between 10000 and 90000...");
			isValid = false;
		}
		return isValid;
	}
}
