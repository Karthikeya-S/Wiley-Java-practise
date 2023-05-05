package wiley_core_java;

public class ConstructorTypes {
	
	//Constructor Overriding
	public ConstructorTypes() {
		System.out.println("0 args constructor");
	}
	public ConstructorTypes(int a,int b) {
		System.out.println("2 args constructor: "+(a+b));
	}
	public ConstructorTypes(float a, int b) {
		System.out.println("0 args constructor");
	}
	public void add() {
		
	}

	public static void main(String[] args) {
		ConstructorTypes ct = new ConstructorTypes();
		ConstructorTypes ctadd = new ConstructorTypes(5,11);
	}
}
