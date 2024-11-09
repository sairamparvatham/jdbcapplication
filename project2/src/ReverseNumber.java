import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		long a,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a up to 6 digit value");
		a=sc.nextLong();
		for(int i=0;i<6;i++)
		{
			n=a%10;
			System.out.print(n);
			a=a/10;
		}
		
	}

}