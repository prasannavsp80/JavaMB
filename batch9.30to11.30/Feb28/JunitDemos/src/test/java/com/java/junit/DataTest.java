package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DataTest {

	@Test
	public void testArray() {
		int[] a = new int[] {1,2,3};
		int[] b = new int[] {1,2,3};
		assertArrayEquals(a, b);
	}
	@Test
	public void testNull() {
		Data data1 = null;
		assertNull(data1);
		Data data = new Data();
		assertNotNull(data);
	}
	
	@Test
	public void testEvenOdd() {
		Data data = new Data();
		assertTrue(data.evenOdd(2));
		assertFalse(data.evenOdd(1));
	}
	@Test 
	public void testTat() throws ParseException {
		Data data = new Data();
		String sdate = "2024-02-25";
		String edate = "2024-02-26";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sdf.parse(sdate);
		Date endDate = sdf.parse(edate);
		assertEquals("Leave Start-Date cannot be Yesterday's date...", data.tat(startDate, endDate));
		assertEquals("Leave End-Date cannot be Yesterday's date...", data.tat(new Date(), endDate));
		assertEquals("Leave Applied Successfully...", data.tat(new Date(), new Date()));
	}
	@Test
	public void testMax3() {
		Data data = new Data();
		assertEquals(12, data.max(12, 5, 7));
		assertEquals(12, data.max(5, 12, 7));
		assertEquals(12, data.max(5, 7, 12));
	}
	
	@Test
	public void testSum() {
		Data data = new Data();
		assertEquals(5, data.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
		Data data = new Data();
		assertEquals("Welcome to Java Programming...", data.sayHello());
	}

}
