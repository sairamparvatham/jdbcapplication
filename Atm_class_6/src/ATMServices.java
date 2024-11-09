
public class ATMServices {
	public static int balance =5000;
	public double balance() {
		return balance;
	}
	public void deposit(int amount) {
		balance=balance+amount;
	}
	public void withdraw (int amount) {
		balance=balance-amount;
	}
}
