package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMapDemo {
 public static void main(String[] args) {
	HashMap<Integer,String> g=new HashMap<>();
	g.put(001,"sairam@gmail.com");
	g.put(002,"ram@gmail.com");
	g.put(003,"sai@gmail.com");
	g.put(004,"akram@gmail.com");
	System.out.println(g);
	g.put(002,"you@gmail.com" );
	System.out.println(g);
	Set<Integer> key =g.keySet();
	System.out.println(key);
	Collection<String> values=g.values();
	System.out.println(values);
	for(Map.Entry<Integer,String> entry : g.entrySet()) {
		System.out.println(entry);
		System.out.println(entry.getKey()+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+entry.getValue());
	}
	
	
}
}
