
public class BankAccounts {
	long accountNo;
	String name;
	String ifsc;
	String branch;
	public BankAccounts(long accountNo, String name, String ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account No: "+accountNo);
		System.out.println("Account Holder: "+name);
		System.out.println("Account IFSC: "+ifsc);
		System.out.println("Account Branch: "+branch);
	}


}
