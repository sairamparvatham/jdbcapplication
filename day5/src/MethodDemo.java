
public class MethodDemo {
	// statistic methos - utility perpose
	public static void findSquair(int num) {
		int squair = num*num;
		System.out.println(squair);
	}
//	public static void findCube(int num) {
//		int cube = num*num*num;
//		System.out.println(cube);
//	}
//	 it is a instance method if you  want to access you must create the objects
//object level methods
	public  void findCube(int num) {
		int cube = num*num*num;
		System.out.println(cube);
	}
	public static int findMax(int Num1,int Num2) {
		int Max=(Num1>Num2) ? Num1 : Num2;
		return Max;
	}
	public static double findTotal (double num1,double num2) {
		return num1+num2;
	}
	public static double findAvg (double num1,double num2) {
		double total= findTotal(num1,num2);
		double avg = total/2;
		return avg;
	}
	public static void main(String[] args) {
		//accesing static methods
		findSquair(10);//directly with sample class
		MethodDemo m= new MethodDemo();
		m.findSquair(20);//refference varible
		MethodDemo.findSquair(30);//using class name
//		findCube(10);//directly with sample class
		//accsing instance methods
		MethodDemo v= new MethodDemo();
		v.findCube(10);
		int max = findMax(123,100);
		System.out.println(max);
		double avg =findAvg(44.5,55.5);
		System.out.println(avg);
	}
}
