package com.edubridge.elite.service;
import com.edubridge.elite.model.Student;
public class StudentServece {
	Student[] students;
	public StudentServece() {
		students=new Student[] {
				new Student(1001,"wills",9110591951l,"parvathamsairam@gmail.com"),
				new Student(1002,"ram",9110591554l,"ram@gmail.com"),
				new Student(1001,"sai",9116791951l,"sai.com"),
				new Student(1001,"hemanth",9119091951l,"hemanth@gmail.com"),
		};
		}
	public Student[] getAllStudents() {
		return students;
	}
}
