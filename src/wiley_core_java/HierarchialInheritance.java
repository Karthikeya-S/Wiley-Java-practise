package wiley_core_java;

class vehicle1{
	public void steering() {
		System.out.println("Steering");
	}
}

class car1 extends vehicle1{
	public void airbag() {
		System.out.println("Airbag");
	             }
}

class truck1 extends vehicle1{
	public void hydraulicpump() {
		System.out.println("Hydraulic Pump");
	}
}

public class HierarchialInheritance {
	public static void main(String[] args) {
		truck1 t = new truck1();
		car1 c = new car1();
		t.steering();
		t.hydraulicpump();
		c.steering();
		c.airbag();
	}
}