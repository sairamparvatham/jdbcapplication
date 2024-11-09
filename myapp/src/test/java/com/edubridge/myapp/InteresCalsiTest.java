package com.edubridge.myapp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InteresCalsiTest {
	private static InterestCal c;
	@BeforeAll
	public static void setUp(){
		c= new InterestCal();
		
	}
	@Test
	public void testSi() {
		double actual =c.si(10000, 1, 2);
		double expected=200;
		assertEquals(expected,actual);
	}
	@Test
	public void testSi1() {
		double actual =c.si(10000, 1, 4);
		double expected=400;
		assertEquals(expected,actual);
	}
}
