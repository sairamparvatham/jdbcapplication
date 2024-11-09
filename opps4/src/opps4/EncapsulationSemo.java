package opps4;

public class EncapsulationSemo {
	public static void main(String[] args) {
		Student st=new Student(101,"kiran","kiran@gmail.com",9110591951l);
		st.setStudent_id(222);
		System.out.println(st.getStudent_id());
		System.out.println(st.getStudent_email());
		System.out.println(st.getStudent_name());
		System.out.println(st.getStudentMobile());
		
	}
}
