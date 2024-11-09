
public class DisscountCalc {
	public double findDiscount(int bill) {
		double discount= 0;
		if(bill<250) {
			 discount= bill*0.05;
			
		}
		else if (bill<500){
			 discount= bill*0.1;
			
		}
		else if (bill<750){
			 discount= bill*0.15;
			
		}
		else if (bill<1000){
			 discount= bill*0.1;
			
		}
		return discount ;
	}
}
