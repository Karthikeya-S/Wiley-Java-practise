package wiley_core_java;

class vehicle {
	public void tier() {
		System.out.println("tier");
	}
	public void steering(){
		System.out.println("Steering");
	}
}
class car extends vehicle{
	public void airbag() {
		System.out.println("Airbag");
	}
	
}
class smartcar extends car{
	public void sensor() {
		System.out.println("Sensors");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		smartcar sc = new smartcar();
		sc.tier();
		sc.steering();
		sc.airbag();
		sc.sensor();
	}
}
