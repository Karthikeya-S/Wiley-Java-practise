package Lambda;

import java.util.*;
import java.util.function.Function;

public class MultiFunction {
	private static HashMap<Integer, String> employee = new HashMap<>();
	
	public static void add(String name, int ID) {
		if(!employee.containsKey(ID)) {
			employee.put(ID, name);
		}
		else {
			System.out.println("Employee already exists");
		}
	}
	public static void main(String[] args) {
		Function<Integer, String> get = (Integer ID) -> {
			if(employee.containsKey(ID))	return employee.get(ID);
			else {
				return "INVALID ID";
			}
		};
		
		add("Karthikeya",1011);
		add("Sano",1012);
		add("Selva",1013);
		add("Asjad",1014);
		add("Shyam",1015);
		add("Prk",1016);
		
		System.out.println("ID = 1011, Name = "+get.apply(1011));
		System.out.println("ID = 1012, Name = "+get.apply(1012));
		System.out.println("ID = 1013, Name = "+get.apply(1013));
		System.out.println("ID = 1014, Name = "+get.apply(1014));
		System.out.println("ID = 1015, Name = "+get.apply(1015));
		System.out.println("ID = 1016, Name = "+get.apply(1016));
	}
}
