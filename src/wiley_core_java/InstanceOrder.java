package wiley_core_java;

public class InstanceOrder {
	String name;
	int age;
	{
		name = "Karthikeya";
		age = 21;
		System.out.println("Instnace Block");
	} //Instance Block
	public InstanceOrder() {
		System.out.println("Name: "+name+" Age: "+age);
		System.out.println("Constructor Block");
	}
	public InstanceOrder(int a,int b) {
		System.out.println("Parameterized Constructor : "+(a+b));
	}
	public static void main(String[] args) {
		InstanceOrder ord = new InstanceOrder();
		new InstanceOrder(5,6);
	}
	
	//Instance Block will be called whenever an object is created. We created object 2 times. So it will call the object 2 times.
}