package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testConstructor() {
		Employ employ = new Employ();
		assertNotNull(employ);
		Employ employ1 = new Employ(1, "Ananth", "Male", "Java", "Programmer", 88423);
		assertEquals(1, employ1.getEmpno());
		assertEquals("Ananth", employ1.getName());
		assertEquals("Male", employ1.getGender());
		assertEquals("Java", employ1.getDept());
		assertEquals("Programmer", employ1.getDesig());
		assertEquals(88423, employ1.getBasic(), 0);
	}

	@Test
	public void testHashCode() {
		Employ employ1 = new Employ(1, "Ananth", "Male", "Java", "Programmer", 88423);
		Employ employ2 = new Employ(1, "Ananth", "Male", "Java", "Programmer", 88423);
		assertEquals(employ1.hashCode(), employ2.hashCode());
	}
	
	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Sravani");
		employ.setGender("Female");
		employ.setDept("React");
		employ.setDesig("Manager");
		employ.setBasic(88832);
		 
		assertEquals(1, employ.getEmpno());
		assertEquals("Sravani", employ.getName());
		assertEquals("Female", employ.getGender());
		assertEquals("React", employ.getDept());
		assertEquals("Manager", employ.getDesig());
		assertEquals(88832, employ.getBasic(), 0);
	}
}
