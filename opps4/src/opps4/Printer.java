package opps4;
//@FunctionalInterface //it has only one abstract method and n number static default methods 
public interface Printer {
	//public static final String version_No="v1.0.0";
	String Version_no="v1.0.0";
	//public abstract void  printJob();
	
	void printJob();
	void Scan();
	
	default void tShirtPrintJob() {
		System.out.println("T-Shirt printing job");
	}
	default void coffeCupPrintJob() {
		System.out.println("Coffe Cup  printing job");
	}
	static void threeDPrintingJob() {
		System.out.println("3d Printing job");
	}
}