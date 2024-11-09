import java.util.*;
public class TaxCal {
	public static void TaxCal(long salary){
		double tax=0.0;
		if (salary<=300000){
			tax=0.0;
			System.out.println("tax amount = "+tax);
			System.out.println("net amount in hand = "+(salary-tax));
		}
		else if(salary<=700000){
			tax= (salary-300000)*0.05;
			System.out.println("tax amount = "+tax);
			System.out.println("net amount in hand = "+(salary-tax));
		}
		else if(salary<100000){
			double three_to_7L= 400000*0.05;
			double seven_to_10L=(salary-700000)*0.10;
			tax=three_to_7L+seven_to_10L;
			System.out.println("tax amount = "+tax);
			System.out.println("net amount in hand = "+(salary-tax));
		}
		else if(salary<1200000) {
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		long salary=sc.nextLong();
		TaxCal(salary);
	}

}
