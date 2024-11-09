class parent{
	public  final void study(){  //final method do not allow over-ride//
		System.out.println("ehdefhi");
	}
	public void property() {
		System.out.println("100 acars land+100kg gold+1000000");
	}
	public void marry() {
		System.out.println("arrange marage");
	}
	
}
class child extends parent{
	@Override
	public void marry() {
		super.marry();//super key word used for both parent&chaild class methods
		System.out.println("lovemarrige");
	}
//	public void study(){
//		System.out.println("acting");
//	}
}
public class MethodOverRiding {
	public static void main(String[] args) {
		parent p =new parent();
		p.study();
		p.marry();
		p.property();
		child c = new child();
		c.marry();
		c.study();
		c.property();
		
	}
	
}
