
public class Driver {
	String name;
	int height;
	String Gender;
	Address[] address;
	public Driver(String name, int height, String gender, Address[] address) {
		super();
		this.name = name;
		this.height = height;
		Gender = gender;
		this.address = address;
	}
	public void display() {
		System.out.println("Driver Name: "+name);
		System.out.println("Driver Gender: "+Gender);
		System.out.println("Driver Height: "+height);
		for( Address st: address) {
			st.displayAddress();
			System.out.println("---------------------------");
		}
	}

}
