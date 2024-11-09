package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachDemo {
public static void main(String[] args) {
	
	List<String> courses = Arrays.asList("java","python","angular","react");
	Consumer<String > consumer= (value) -> System.out.println(value);
	courses.forEach(consumer);
	System.out.println("-----------------------");
	courses.forEach((value)->System.out.println(value));
	System.out.println("------------------------");
	courses.forEach(System.out::println);
	System.out.println("------------------------");
	List<Double> salaries= Arrays.asList(55000.0,3000.00,59090.00,8990.00);
	Consumer<Double > salaries1 = (value4) -> System.out.println(value4);
	salaries.forEach(salaries1);
	System.out.println("-----------------------");
	salaries.forEach((value4)->System.out.println(value4));
	System.out.println("------------------------");
	salaries.forEach(System.out::println);
	
	List<Double>filteredSalaries=new ArrayList<Double>();
	salaries.forEach((salary) -> {
		if (salary>=45000)
			filteredSalaries.add(salary);
	});
	System.out.println(filteredSalaries);
	
}

}
																		