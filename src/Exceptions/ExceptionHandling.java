 	package Exceptions;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("First Statement");
		int[] arr = {1,2,3,4};
		try {
			
			System.out.println(arr[1]);
			System.out.println(arr[4]);
			System.out.println("Simple statement");
			String str = "Karthikeya";
			System.out.println(str.charAt(1));
			System.out.println(12/0);
			System.out.println("Simple statement 1");
		}catch(ArrayIndexOutOfBoundsException e){		//exception is the parent of all types of exceptions
			String s = e.getMessage();
			System.out.println(s);
			e.printStackTrace();
		}
			catch(IndexOutOfBoundsException e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.hashCode());
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Another Statement");
	}
}
	