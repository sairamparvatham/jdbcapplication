
public class StudentTest {

	public static void main(String[] args) {
		//object creation or object instantiation
		Student s1=new Student(101,"sai",50);
		s1.displayStudentDeatials();
		s1.studentResult();
		System.out.println("-------------------");
		Student s2=new Student(102,"ram",39);
		s2.displayStudentDeatials();
		s2.studentResult();
		System.out.println("-------------------");
		Student s3= new Student(103,"kumar",80);
		s3.displayStudentDeatials();

	}

}
