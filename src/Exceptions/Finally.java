package Exceptions;

public class Finally {
	public static void main(String[] args) {
		try {
			System.out.println("11111");
			System.out.println("Wiley");
			System.out.println(10/0);
//			try {
//				System.out.println(10/0);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}finally {
//				System.out.println("Nested close connection");
//			}
			
			System.out.println("Edge");
		}
		catch(Exception e) {
			System.out.println("Catch Block");
			try {
				System.out.println("Try catch block inside catch block");
				System.out.println(10/0);
			}	catch(Exception ee) {
				ee.printStackTrace();
			}finally {
				System.out.println("Nested Close connection inside catch block");
			}
			System.exit(0);
			System.out.println(10/0);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
			try {
				System.out.println("Try catch block inside finally block");
				System.out.println(10/0);
			}catch(Exception e1) {
				e1.printStackTrace();
			}finally {
				System.out.println("Nested close connection inside finally block");
			}
		}
	}

}
