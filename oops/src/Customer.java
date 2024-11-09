
public class Customer {
	private int customerId;
	private String customerName;
	BankAccounts[] customerBankAccounts;
	
	
	public Customer(int customerId, String customerName, BankAccounts[] customerBankAccounts) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBankAccounts = customerBankAccounts;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer Details");
		System.out.println("---------------------------");
		System.out.println("Customer Id :"+customerId);
		System.out.println("Customer Id :"+customerName);
		System.out.println("Customer Account Details");
		System.out.println("---------------------------");
		
		for( BankAccounts account : customerBankAccounts) {
			account.displayAccountDetails();
			System.out.println("---------------------------");
		}
	
	}


}
