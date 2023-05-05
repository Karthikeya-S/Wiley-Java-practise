package wiley_core_java;

abstract class test1{
	{
		System.out.println("Test 1 instance block");
	}
	public abstract void m1();
	public void m2() {
		System.out.println("Test 1 m2 method");
	}
	public static void main(String[] args) {
		System.out.println("This is test1 main method");
	}
	public test1() {
		System.out.println("This is test1 constructor");
	}
}

class test2 extends test1{
	{
		System.out.println("Test2 instance block");
	}
	@Override
	public void m1() {
		System.out.println("Test 2 m1 method");
	}
	public static void main(String[] args) {
		System.out.println("This is test2 main method");
	}
	public test2() {
		System.out.println("This is test2 constructor");
	}
	
}
public class AbstractClass {
	public static void main(String[] args) {
		test2 t2 = new test2();
		test1 t1 = new test2();
		t2.m1();
		t2.m2();
		
		test1.main(args);
		t2.main(args);
		t1.m1();
		t1.main(args);
	}
}
