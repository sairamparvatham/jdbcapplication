
public class Battrey {
	String name,capasity,dissChargeTime,ChargingTime;

	public Battrey(String name, String capasity, String dissChargeTime, String chargingTime) {
		super();
		this.name = name;
		this.capasity = capasity;
		this.dissChargeTime = dissChargeTime;
		ChargingTime = chargingTime;
	}
	public void displayBattrey() {
		System.out.println("Battery name: "+name);
		System.out.println("Battery capasity: "+capasity);
		System.out.println("Battery dissCharge Time: "+dissChargeTime);
		System.out.println("Battery Charging Time: "+ChargingTime);
	}
}
