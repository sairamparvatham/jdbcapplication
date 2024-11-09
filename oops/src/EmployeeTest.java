
public class EmployeeTest {
	public static void main (String[] args) {
		Address address=new Address("hyderabad","telangana","india");
		EmkployeeId emp= new EmkployeeId(1001,"ram",9110591951l,address);
		emp.displayEmployee();
	}
}
