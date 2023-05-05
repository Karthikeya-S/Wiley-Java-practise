package wiley_core_java;

class employee{
	private String name;
	private int age;
	public String getname() {
		return name;
	}
	public String setname(String name) {
		return this.name = name;
	}
	public int getage() {
		return age;
	}
	public int setage(int age) {
		return this.age = age;
	}
}

class empimplement{
	public void show(employee emp) {
		System.out.println("Calling show method");
		System.out.println("Name: "+emp.getname()+" Age: "+emp.getage());
	}
}
public class EmpEncapsulation {
	public static void main(String[] args) {
		employee emp = new employee();
		emp.setname("Karthikeya");
		emp.setage(21);
		empimplement emp1 = new empimplement();
		emp1.show(emp);
	}
}
