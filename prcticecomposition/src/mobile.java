
public class mobile {
	String name;
	String model;
	String networkType;
	Storage[] strorage;//has a relationship //objective based on class type//properties based on class type. composition
	// for multiple values we use class type array
	public mobile(String name, String model, String networkType,Storage[] strorage) {
		super();
		this.name = name;
		this.model = model;
		this.networkType = networkType;
		this.strorage=strorage;
	}
	public void dissply() {
		System.out.println("Mobile Name: "+name);
		System.out.println("Mobile Model Number: "+model);
		System.out.println("Mobile Network type: "+networkType);
		for( Storage st: strorage) {
			st.display();
			System.out.println("---------------------------");
		}
	}
}
