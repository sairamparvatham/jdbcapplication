
public class typecasting {
	public static void main(String[] args) {
		int i=130;
		byte x=(byte)i;
		System.out.println(i);
		System.out.println(x);
		long l =1000l;
		int i2=(int)l;
		System.out.println(l);
		System.out.println(i2);
		double d =123.894;
		int i3 =(int)d;
		System.out.println(d);
		System.out.println(i3);
		
		String s= "10";
		int num =Integer.parseInt(s);
		System.out.println(s);
		System.out.println(num);
		
		String s2= "10.78";
		double num4 =Double.parseDouble(s2);
		System.out.println(s2);
		System.out.println(num4);
		 
		int r=20;
		String e=String.valueOf(r);
		System.out.println(e);
		
	}
}
