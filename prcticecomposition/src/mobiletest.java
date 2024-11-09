
public class mobiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage s=new Storage("16gb","512gb");
		Storage s1=new Storage("8gb","256");
		Storage[] dummy= {s,s1};
		mobile m=new mobile("redmi","123.os","5g",dummy);
		m.dissply();
		
	}
	
}
