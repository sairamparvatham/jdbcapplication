package programizeexamples;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("enter a no");
		Scanner sc =new Scanner(System.in);
		int b =sc.nextInt();
		int a=0;
		while (b!=0) {
			int c=b%10;
			 a= a*10+(b%10);
			 b=b/10;
		}
		System.out.println(a);
	}
}
