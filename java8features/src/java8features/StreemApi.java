package java8features;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreemApi {

	public static void main(String[] args) {
		List<Double> salaries = Arrays.asList(55000.0, 45000.0, 35000.0, 65000.0);
		
		Stream<Double> stream = salaries.stream();
		
		Predicate<Double> predicate = (value) -> value >= 50000;
		
		stream
		.filter(predicate)
		.forEach(System.out :: println);
		
		System.out.println("-------filter salaries < 50000------------");
		salaries
		.stream()
		.filter((salary) -> salary < 50000)
        .forEach(System.out :: println);
	List<String> courses =Arrays.asList("python","java","angular","js");
		courses
	       .stream()
	       .filter((course)->course.length()>5)
	       .forEach(System.out::println);
		courses
	       .stream()
	       .filter((course)->course.startsWith("j"))
	       .forEach(System.out::println);
	 System.out.println("-----update each salaray by 2000 and display udated salary----");
	 salaries
		.stream()
		.map((salary) -> salary =salary+ 2000)
		.forEach(System.out :: println);
	 System.out.println("----- display sum of  salarys----");
	 	double sal=0;
	 	for(double salary:salaries) {
	 		sal=sal+salary;
	 	}
	 	Double totalSalary = salaries
				.stream()
				.reduce((sal1,sal2) -> sal1 + sal2)
				.get();
		System.out.println(totalSalary);
		
		totalSalary = salaries
				.stream()
				.mapToDouble((salary) -> salary)
				.sum();
		System.out.println(totalSalary);
		
		System.out.println("-------Average Salary----------");
		
		double avgSalary = salaries
		.stream()
		.mapToDouble((salary) -> salary)
		.average()
		.getAsDouble();
		
		System.out.println(avgSalary);
		
		double maxSalary = salaries
				.stream()
				.mapToDouble((salary) -> salary)
				.max()
				.getAsDouble();
				
		System.out.println(maxSalary);
				
		
		double minSalary = salaries
				.stream()
				.mapToDouble((salary) -> salary)
				.min()						
				.getAsDouble();
						
		System.out.println(minSalary);

	}

}
