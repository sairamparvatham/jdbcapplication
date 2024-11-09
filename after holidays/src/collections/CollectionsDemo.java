package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
public static void main(String[] args) {
	List<Integer> list= Arrays.asList(22,56,78,34,56,90);
	System.out.println(list);
	
	Collections.sort(list);
	System.out.println(list);
	int index =Collections.binarySearch(list,78);
	System.out.println(index);
	

}
}
