
public class Car {
	String name;
	String model;
	String reg_No;
	Driver[] driver;
	public Car(String name, String model, String reg_No, Driver[] driver) {
		super();
		this.name = name;
		this.model = model;
		this.reg_No = reg_No;
		this.driver = driver;
		
		
	}
	public void display() {
		System.out.println("car name: "+name);
		System.out.println("car model: "+model);
		System.out.println("car registration no: "+reg_No);
		System.out.println("-----------------------");
		for( Driver st: driver) {
			st.display();
			System.out.println("---------------------------");
		}

		
	}
}
