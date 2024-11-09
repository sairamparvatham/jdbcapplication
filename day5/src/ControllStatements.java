
public class ControllStatements {
	public static boolean isEven (int num) {
		boolean status= false;
		if (num%2==0) {
			status = true;
		}
		return status;
	}
	public static void isEvenOrOdd(int num) {
		boolean status= false;
		if (isEven(num)) {
			System.out.println(num+"is even");
		}
		else {
			System.out.println(num+"is a odd number");
		}
	}
	public static void main(String[] args) {
		isEvenOrOdd(10);
		isEvenOrOdd(15);
	}

}
