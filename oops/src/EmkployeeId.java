
public class EmkployeeId {
	int empolyeeId;
	String employeeName;
	long Employeemobile;
	Address employeeAddress;//Entity reference or as a relation
	public EmkployeeId(int empolyeeId, String employeeName, long employeemobile, Address employeeAddress) {
		super();
		this.empolyeeId = empolyeeId;
		this.employeeName = employeeName;
		Employeemobile = employeemobile;
		this.employeeAddress = employeeAddress;	
	}
	public void displayEmployee() {
		System.out.println("Employee Id:"+empolyeeId);
		System.out.println("Emoployee Name: "+employeeName);
		System.out.println("Employee Mobile: "+Employeemobile);
		employeeAddress.displayAddress();
	}
}
