package Exceptions;

//In Java, Uncaught Exceptions occur when an exception is thrown within a method and
//there is no code in place to catch and handle the exception. When this happens, the exception is
//propagated up the call stack until it is caught by an appropriate exception handler or
//until it reached the top of the call stack and is terminated.
public class ExceptionPropagation {
	public static void main(String[] args) {
		try {
			method1();
			
		}catch(Exception e) {
			System.out.println("Exception Caught "+e.getMessage());
		}
	}
	public static void method1() throws Exception{
		method2();
	}
	public static void method2() throws Exception{
		throw new Exception("Exception occured in the method2");
	}
}
