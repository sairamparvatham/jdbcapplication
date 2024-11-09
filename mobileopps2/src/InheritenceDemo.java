
//singleinheritence
public class InheritenceDemo {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.call();
		m.sms();
		System.out.println("------------");
		SmartMobile sm=new SmartMobile();
		sm.call();
		sm.browser();
		sm.sms();
		sm.videocall();
	}
	

}
