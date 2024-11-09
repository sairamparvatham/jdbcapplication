
public class Practice {
	public static String leapYear(int year) {
		String result="null";
		if(year%100==0) {
			if(year%400==0){
				 result="leapyear";
			}
			else {
				result="not a leap year";
			}
		}else {
			if(year%4==0) {
				result="leapyear";
			}else {
				result="not a leap year";
			}
		}
		
		return result;
	}
	public static String even(int num) {
		String result="null";
		if (num%2==0) {
			result="even num";
		}else {
			result="odd num";
		}
		return result;
	}
	public static int fact(int num) {
		int result=1;
		if(num==0) {
			result=1;
		}else {
			for(int i=1;i<=num;i++) {
				result=result*i;
			}
		}
		return result;
	}
	public static int sumOfNumbers(int num) {
		int result=0;
		for(int i=0;i<=num;i++) {
			result=result+i;
		}
		
		return result;
	}
	public static int[] gcd(int num1) {
		int result=0;
		int [] arr=new int[100];
		for(int i=0;i<=num1;i++) {
			if(num1%i==0) {
				for (int j=0;j<=arr.length;j++) {
					arr[j]=i;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		String y=leapYear(2025);
		System.out.println(y);
		String e=even(23);
		System.out.println(e);
		int r=fact(10);
		System.out.println(r);
		int s= sumOfNumbers(10);
		System.out.println(s);
		System.out.println(gcd(15)); 
	}

}
