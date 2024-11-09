package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet <Integer> l1=new LinkedHashSet<>();
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
		System.out.println(l1.isEmpty());
		System.out.println(l1.remove(100));
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.addFirst(900);
		System.out.println(l1);
		l1.addLast(800);
		System.out.println(l1);
		
		
		
	}

}
