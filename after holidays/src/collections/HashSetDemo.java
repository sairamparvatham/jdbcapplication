package collections;
import java.util.HashSet;
import java.util.Stack;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> l1=new HashSet<>();
		System.out.println(l1.isEmpty());
		l1.add(100);
		l1.add(400);
		l1.add(500);
		l1.add(300);
		System.out.println(l1);
		l1.add(300);
		System.out.println(l1);
		l1.add(null);
		boolean existed =l1.contains(123);
		System.out.println(existed);
		System.out.println(l1.isEmpty());v
		System.out.println(l1.remove(100));
		System.out.println(l1);
		
		
		
		
	}

}
