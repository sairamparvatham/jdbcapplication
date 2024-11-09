
public class MovieTest {
	public static void main(String[] args) throws CloneNotSupportedException {    
		Movie m1=new Movie(111,"Devara","koratala shiva");
		Movie m2=new Movie(222,"kalki","sairam");
		Movie m3=new Movie(111,"Devara","koratala shiva");
		//shallo cloning
		Movie m4=m1;
		
		System.out.println(m1.toString());
		System.out.println(m2);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		//Deep cloning
		Movie m5=(Movie) m2.clone();
		System.out.println(m5.hashCode());
		System.out.println(m2.hashCode());
		
		
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m1==m4);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));
		
		
		
		
		
		
		
		
		

	}
}
//Movie@24d46ca6
//Movie@4517d9a3 Movie is class name,4517d9a3 hash code hexa decimal number
//public String toString() {
//    return getClass().getName() + "@" + Integer.toHexString(hashCode());
//}from object class
//before over ride hash ccode
//1705736037
//455659002
//after over riding
//111
//222
//== mean for refference comparission
