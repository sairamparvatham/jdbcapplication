package com.edubridge.elite.main;
import com.edubridge.elite.model.Student;
import com.edubridge.elite.service.StudentServece;

public class StudentApp {
public static void main(String[] args) {
	StudentServece services = new StudentServece();
	Student[] students =services.getAllStudents();
	for(Student student: students) {
		System.out.println(student);
	}
	
}
}
