package Exceptions;

import java.util.ArrayList;
class StringNotFound extends RuntimeException{
	public StringNotFound(String msg) {
		super(msg);
	}
}
public class Unchecked {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("Karthikeya S");
		students.add("Karthik Selva");
		students.add("Asjad");
		if(!students.contains("Karthikeya")) {
			try {
				throw new StringNotFound("The specified string is not found");
			}catch(StringNotFound e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Message one");
		System.out.println("Message 2");
	}

}
