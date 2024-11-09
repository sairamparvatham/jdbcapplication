import java.util.Scanner;
public class Prctice {

	public static void main(String[] args) {
		int a=10;
		int b=a++;
		System.out.println(a);
		System.out.println(b);
		int x=10;
		int y=++x;
		System.out.println(a);
		System.out.println(b);
		int f=20;
		int g=f--;
		System.out.println(f);
		System.out.println(g);
		int u=50;
		int v=--u;
		System.out.println(u);
		System.out.println(v);
		System.out.println(10+10+"10+10"+10+10);
		
		
		int m;
		int l;
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		Scanner sc = new Scanner(System.in);
		l=sc.nextInt();
		int max=(x>y) ? x : y;
		int min=(x<y) ? x : y;
		System.out.println("max ="+max);
		System.out.println("max ="+min);
	}

}
