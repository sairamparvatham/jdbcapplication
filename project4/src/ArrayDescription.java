import java.util.*;
public class ArrayDescription {
	public static void main(String[] args) {
		//Array declaration
		Double [] arr1= {75000.0,55000.0,45000.0,65000.0,85000.0,95000.0};
		int q;
		double max=arr1[0];
		double min=arr1[0];
		double sum=0;
		for(q=0;q<arr1.length;q++) {
			System.out.println(arr1[q]);
			sum= sum+arr1[q];
			if (arr1[q]>max){
				max=arr1[q];
			}
			else if(arr1[q]<min) {
				min=arr1[q];
			}
			q++;	
		}
		System.out.println("total");
		System.out.println(sum);
		System.out.println("max value");
		System.out.println(max);
		System.out.println("minimum value");
		System.out.println(min);
}
}