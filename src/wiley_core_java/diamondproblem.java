package wiley_core_java;

interface person{
	public void getrole();
	
}

class teacher implements person{
	@Override
	public void getrole() {
		System.out.println("Teaching");
	}
}

class classroom extends teacher implements person{
	@Override
	public void getrole() {
		System.out.println("Classroom Teaching");
	}
}
public class diamondproblem {
	public static void main(String[] args) {
		classroom cls = new classroom();
		cls.getrole();
		
	}

}
