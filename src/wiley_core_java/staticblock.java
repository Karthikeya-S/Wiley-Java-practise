package wiley_core_java;

public class staticblock {
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	public staticblock() {
		System.out.println("Constructor Block");
	}
	
	public static void main(String[] args) {
		new staticblock();
		new staticblock();
		new staticblock();
	}
}
