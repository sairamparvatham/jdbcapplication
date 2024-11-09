package com.edubridge.myProject2.test;
import com.edubridge.myproject1.util.*;
import IntrestCacl.IntrstCacl;
public class CalTest {
	public static void main(String[] args) {
		int square =Calc.findSquare(10);
		int cube =Calc.findcube(10);
		double intrest = IntrstCacl.findSquare(200000,12);
		System.out.println(square);
		System.out.println(cube);
		System.out.println(intrest);
	}
}
