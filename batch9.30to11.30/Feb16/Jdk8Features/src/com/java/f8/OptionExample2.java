package com.java.f8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionExample2 {


    static List<Emp> employList;

    static {
                employList = new ArrayList<Emp>();
                employList.add(new Emp(1,"Himanshu",85233));
                employList.add(new Emp(2,"Harshita",90833));
                employList.add(new Emp(3,"Ilayarani",91145));
                employList.add(new Emp(4,"Hari Prasad",78667));
    }

    public List<Emp> showEmp() {
        return employList;
    }

    public Emp searchEmp(int empno) {
        Emp empFound = null;
        for(Emp e : employList) {
            if (e.getEmpno()==empno) {
                empFound=e;
            }
        }
        return empFound;
    }

    public static void main(String[] args) {
        int empno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ No   ");
        empno = sc.nextInt();
//        Emp employFound = new OptionExample2().searchEmp(empno);
//        System.out.println(employFound);
        Optional<Emp> empFound = Optional.ofNullable(
        		new OptionExample2().searchEmp(empno));
        if (empFound.isPresent()) {
        	System.out.println(empFound);
        } else {
        	System.out.println("*** Emp Record Not Found ***");
        }
	}
}
