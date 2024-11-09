package com.edubridge.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calsiTest {
	private static calsi c;
	private static InterestCal d;
//	@BeforeEach
	@BeforeAll
	public static void setup() {
		c= new calsi();
	}
	@BeforeAll
	public static void setup1() {
		d= new InterestCal();
	}
//	@AfterEach
	@AfterAll
	public static void tearUp() {
		c=null;
	}
	@AfterAll
	public static void tearUp1() {
		d=null;
	}
	@Test
	public void testFindSquare() {
//		calsi c=new calsi();
		int actual =c.findsquare(10);
		int expected=100;
		assertEquals(expected,actual);
	}
	@Test
	public void testFindCube() {
//		calsi c=new calsi();
		int actual =c.findsquare(10);
		int expected=100;
		assertEquals(expected,actual);
	}
	@Test
	public void sikgwo() {
//		calsi c=new calsi();
		double actual =d.si(10000,1,1);
		double expected=100;
		assertEquals(expected,actual);
	}
	
	
}
