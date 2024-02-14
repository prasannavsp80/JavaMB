package com.java.main;

import java.util.List;
import java.util.Scanner;

import com.java.bal.EmployBal;
import com.java.exception.EmployException;
import com.java.model.Employ;

public class MainProg {

	static Scanner sc;
	static EmployBal bal;
	
	static {
		sc = new Scanner(System.in);
		bal = new EmployBal();
	}
	
	public static void deleteEmployMain() {
		int empno;
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		System.out.println(bal.deleteEmployBal(empno));
	}
	
	public static void searchEmployMain() {
		int empno;
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		Employ employ = bal.searchEmployBal(empno);
		if (employ!=null) {
			System.out.println(employ);
		} else {
			System.out.println("*** Employ Record Not Found ***");
		}
	}
	public static void showEmployMain() {
		List<Employ> employList = bal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	
	public static void updateEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (Male/Female)  ");
		employ.setGender(sc.next());
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.updateEmployBal(employ));
	}
	
	public static void addEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (Male/Female)  ");
		employ.setGender(sc.next());
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.addEmployBal(employ));
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("--------------");
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Update Employ");
			System.out.println("5. Delete Employ");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				try {
					addEmployMain();
					break;
				} catch (EmployException e) {
					System.err.println(e.getMessage());
					break;
				}
			case 2 : 
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 4 : 
				try {
					updateEmployMain();
					break;
				} catch (EmployException e) {
					e.printStackTrace();
					break;
				}
			case 5 : 
				deleteEmployMain();
				break;
			case 6 : 
				return;
			}
		}while(choice!=6);
	}
}
