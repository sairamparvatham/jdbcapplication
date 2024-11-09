package opps4;

public class Student {
	private int student_id;
	private String Student_name;
	private String student_email;
	private long studentMobile;
	public Student() {
		
	}
	public Student(int student_id, String student_name, String student_email, long studentMobile) {
		super();
		this.student_id = student_id;
		Student_name = student_name;
		this.student_email = student_email;
		this.studentMobile = studentMobile;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
}
