package wiley_core_java;

class vehicles{
	public void steering() {
		System.out.println("Steering");
	}
}

class car11 extends vehicles{
	public void airbag() {
		System.out.println("Airbag");
	}
}

class truck11 extends vehicles {
	public void hydraulicpump() {
		System.out.println("Hydraulic Pump");
	}
}

class sensors extends car11{
	public void sensor() {
		System.out.println("Sensors");
	}
}

class names extends sensors{
	public void sensor_names() {
		System.out.println("Engine Speed sensor");
		System.out.println("Oxygen Sensor");
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		names n = new names();
		n.sensor_names();
		n.steering();
		n.airbag();
		n.sensor();
		System.out.println();
		truck1 t = new truck1();
		t.steering();
		t.hydraulicpump();
	}
}
