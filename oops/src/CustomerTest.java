
public class CustomerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccounts ac1 = new BankAccounts(11223355448855l, "wills", "Hdfc123", "Ameerpet");
		BankAccounts ac2 = new BankAccounts(99668855448855l, "wills", "Sbi456", "Ecil");
		
		BankAccounts[] customerBankAccounts = {ac1, ac2};
		
		Customer customer = new Customer(1111, "Wills", customerBankAccounts);
		customer.displayCustomerDetails();
	}

}
