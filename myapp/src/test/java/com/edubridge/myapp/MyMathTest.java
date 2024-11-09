package com.edubridge.myapp;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyMathTest {
	private static MyMath m;
	@BeforeEach
	public void setUp() {
		m=new MyMath();
	}
	@Test
	public void trew() {
		boolean actual = m.isEven(4);
		boolean expected= true;
		assertEquals(actual,expected);
	}
	@Test
	public void trew1() {
		boolean actual = m.isEven(3);
		boolean expected= false;
		assertEquals(actual,expected);
	}
	@Test
	public void trew12() {
		boolean actual = m.isAuthenticate("Admin","sairam123");
		boolean expected= true;
		assertEquals(actual,expected);
	}
	@Test
	public void trew123() {
		boolean actual = m.isAuthenticate("Admin1","sairam123");
		boolean expected= true;
		assertEquals(actual,expected);
	}
}
