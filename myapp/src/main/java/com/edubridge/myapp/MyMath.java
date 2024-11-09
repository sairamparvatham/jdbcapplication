package com.edubridge.myapp;

public class MyMath {
	String uname1 = "Admin";
	String password1="sairam123";
	public boolean isEven(int num) {
		return num%2==0;
	}
	public boolean isAuthenticate(String uname,String password) {
		if (uname1.equals(uname)&&password1.equals(password)) {
			return true;
		
		}else {
			return false;
		}
		
	}
			
}