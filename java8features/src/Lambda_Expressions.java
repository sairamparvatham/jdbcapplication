@FunctionalInterface
interface MyFuntionalInterface1{
	void wish();
}
class Hello implements MyFuntionalInterface1{
	@Override
	public void wish() {
		System.out.println("hello Every one");
	}
	
}
@FunctionalInterface
interface MyFuntionalInterface2{
	int findSquare(int num);
}
@FunctionalInterface
interface MyFuntionalInterface3{
	int findTotal(int num1,int num2);
}
@FunctionalInterface
interface MyFuntionalInterface5{
	 boolean findTotal(int num1);
}
public class Lambda_Expressions {
public static void main(String[] args) {
	MyFuntionalInterface3 myfun3=(num1,num2)->num1+num2;
	int square= myfun3.findTotal(10,10);
	System.out.println(square);
	MyFuntionalInterface1 myfun1= new Hello();
	myfun1.wish();
	MyFuntionalInterface1 myfun=()->System.out.println("hai");
	myfun.wish();
	MyFuntionalInterface5 myfun5=(num)-> (num%2==0)? true:false;
	
	boolean even= myfun5.findTotal(10);
	System.out.println(myfun5.findTotal(11));
}
}
