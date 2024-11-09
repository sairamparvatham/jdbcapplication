import java.util.ArrayList;

public class Bahubalithred2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses =new ArrayList<>();
        courses.add("java");
        courses.add("angular");
        courses.add("python");
        System.out.println(courses);
        //traversing
        System.out.println("  traversing using for loop");
        for(int index=0; index<courses.size(); index++) {
        	System.out.println(courses.get(index));
        }
        System.out.println("traversing using for each loop");
        for(String course:courses) {
        	System.out.println(course);
        }
        
	}

}
