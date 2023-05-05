package wiley_core_java;
public class AccessModifiers {
	public void test1() {
		System.out.println("Test 1 access public");
	}
	private int test2(){
		System.out.println("test 2 access Private");
		return 2;
	}
	protected String test3() {
		System.out.println("Test 3 access protected");
		return "Test 3 access protected";
	}
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers();
		a.test1();
		a.test2();
		a.test3();
	}
}
