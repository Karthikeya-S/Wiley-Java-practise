package wiley_core_java;
import java.util.*;
class Books{
	int book_id = 1;
	String book_name = "Java Book";
	Books(){
		System.out.println(book_id+" "+book_name);
	}
	public void printhello() {
		System.out.println("Hello from java book");
	}
	
}
public class practise {
	public static void main(String[] args) {
		Books b = new Books();
		b.printhello();
	}
}
