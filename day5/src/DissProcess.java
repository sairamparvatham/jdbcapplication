
public class DissProcess {
	public void displayFinalBill(int bill) {
		DisscountCalc Cal= new DisscountCalc();
		double discount = Cal.findDiscount(bill);
		System.out.println("bill amount"+bill);
		System.out.println("disscount"+discount);
		System.out.println("final bill is = "+(bill-discount));
	

	}

}
