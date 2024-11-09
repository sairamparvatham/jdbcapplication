import java.util.Scanner;
public class ATNMApp {

	public static void main(String[] args) {
		ATMServices servicess= new ATMServices();
		Scanner in = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("XYZ ATM App");
			System.out.println("------------");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("0. Exit");
			System.out.println("Please choose option: ");
			option = in.nextInt();
			
			switch (option) {
			case 1:
				
				break;
			case 2:
				sysyem
				System
				System.out.println("Withdraw");
				break;
			case 3:
				System.out.println("Balence");
				break;
			case 0:
				System.out.println("Invalid option:");
				break;
				
			}
		}while(option!=0);
		}

}