package com.java.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.java.model.Employ;

public class EmployDaoImpl implements EmployDao {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		return employList;
	}

	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}

	@Override
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}

	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound != null) {
			employList.remove(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String updateEmployDao(Employ employUpdated) {
		Employ employFound = searchEmployDao(employUpdated.getEmpno());
		if (employFound!=null) {
			employFound.setEmpno(employUpdated.getEmpno());
			employFound.setName(employUpdated.getName());
			employFound.setGender(employUpdated.getGender());
			employFound.setDept(employUpdated.getDept());
			employFound.setDesig(employUpdated.getDesig());
			employFound.setBasic(employUpdated.getBasic());
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String storeFileDao() throws IOException {
			FileOutputStream fout = new FileOutputStream("d:/java/empcrud.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(employList);
			objout.close();
			fout.close();
			return "Objects Stored in File Successfully...";
		
	}

	@Override
	public String readFileDao() throws IOException, ClassNotFoundException {
			FileInputStream fin = new FileInputStream("d:/java/empcrud.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			employList = (List<Employ>)objin.readObject();
			return "Data Retrieved from the file Successfully...";
	}
}
	