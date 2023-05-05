package wiley_core_java;
import java.util.*;
public class StringFormat {
	public static void main(String[] args) {
		String title = "Java Developer";
		float sal = 200000.456f;
		System.out.format("%s has %.2f INR salary",title,sal);
		
		List<String> techstack = Arrays.asList(
				"Essential Java",
				"Head First Java",
				"Java Design Patterns"
		);
		for(String book: techstack) {
			System.out.format("%-40s - In stock%n",book);
		}
	}

}
