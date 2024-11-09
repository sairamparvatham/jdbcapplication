import java.util.ArrayList;

public class Bahubalithred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList  al  =new ArrayList();
        System.out.println(al.size());
        System.out.println(al);
        al.add(100);
        al.add(300);
        System.out.println(al.size());
        System.out.println(al);
        al.add("adhi");
        al.add("ram");
        System.out.println(al.size());
        System.out.println(al);
        al.set(0, 890);
        System.out.println(al.size());
        System.out.println(al);
        al.add(1,123);
        System.out.println(al.size());
        System.out.println(al);
        al.remove(0);
        System.out.println(al.size());
        System.out.println(al);
        al.remove(1);
        System.out.println(al.size());
        System.out.println(al);
        System.out.println( al.get(0));
//        System.out.println( al.get(4)); // no element so no no4 index created
        al.clear();
//        System.out.println(al.size()); remove all elements
        // it follows insertion orderSystem.out.println(al.size());
        
        
	}

}
