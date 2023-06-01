package Lambda;

interface calc{
	int calculate(int val);
}
public class FunctionalInterfaceClass {
	public static void main(String[] args) {
		calc cl = (int val) -> val+54;
		
		System.out.println("Result: "+cl.calculate(54));
	}
}
