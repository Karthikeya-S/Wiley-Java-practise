package Lambda;

interface Sayable{
	void say();
}
public class Methodreference {
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}	
	public void Hello() {
		System.out.println("Hello, Good Afternoon");
	}
	public static void processSomething() {
		System.out.println("Processing...");
	}
	public static void main(String[] args) {
		Methodreference mt = new Methodreference();
		Sayable isv = mt::Hello;
		isv.say();
		Sayable sayable = Methodreference::saySomething;
		sayable.say();
		
		//thread
		Thread t1 = new Thread();
		t1.start();
	}
}
