package wiley_core_java;

class abc{
	public void cars() {
		System.out.println("cars");
	}
}
public class Polymorphism extends abc{
	
	//Compile-Time Polymorphism
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	
	//Run-Time Polymorphism
	public void cars() {
		System.out.println("Cars are moving");
	}
	public static void main(String[] args) {
		Polymorphism ph = new Polymorphism();
		ph.cars();
		
		
		System.out.println(add(2,6));
		System.out.println(add(3,9,11));
	}
}
