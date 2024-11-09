
public class Student {
	//instance variables inside class but outside the methods.
	int studentId;
	String studentName;
	double studentMarks;
	//static variable
	static String studentbatchcode="2024-2025";
	//constractor
	public Student(int studentsId ,String studentNames,double studentMarks ) {
		System.out.println("constractors");
		studentId=studentsId;
		studentName=studentNames;
		this.studentMarks=studentMarks;//this key word for 
	}
	//instance method
	public void studentResult() {
		if(studentMarks>40) {
			System.out.println("Student result:pass");
		}else {
			System.out.println("student Result :Fail");
		}
	}
	//instance method
	public void displayStudentDeatials() {
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Name"+studentName);
		System.out.println("student Marks:"+studentMarks);
		System.out.println("Student batch:"+studentbatchcode);
	}
}
