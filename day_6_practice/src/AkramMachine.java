import java.util.Scanner;

public class AkramMachine {
	public static double findAvg(int arr[]) {
		int result=0;
		
		for(int i=0; i<arr.length; i++) {
			result=result+arr[i];
		}
		return result/arr.length;
	}
	public static void main(String[] args) {
		int arr []=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("ente the values");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println(findAvg(arr));
	}
}
